package negocio;

import java.util.HashSet;

import dao.PrestamoDao;
import modelo.Cuota;
import modelo.Persona;
import modelo.Prestamo;

public class PrestamoABM {
	private static PrestamoDao instancia;
	private static PrestamoABM instanciaABM;

	protected PrestamoABM() {
		// this.inicializar(); Acá no se inicializa nada
	}

	private static PrestamoDao getInstanciaDao() {
		if (instancia == null) {
			instancia = new PrestamoDao();
		}
		return instancia;
	}
	
	public static PrestamoABM getInstancia() {
		if (instanciaABM == null) {
			instanciaABM = new PrestamoABM();
		}
		return instanciaABM;
	}
	
	public void agregar(double monto, Persona persona) {
		Prestamo prestamo = new Prestamo(monto, persona, new HashSet<Cuota>());
		for (int i = 0; i < 9; i++) {
			// Cálculos de valor de cuota
			prestamo.getCuotas().add(new Cuota(monto/10, prestamo));
		}
		getInstanciaDao().agregar(prestamo);
	}
}
