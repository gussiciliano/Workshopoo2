package negocio;

import java.util.List;

import dao.PersonaDao;
import modelo.Persona;

public class PersonaABM {

	private static PersonaABM instancia;

	protected PersonaABM() {
		// this.inicializar(); Acá no se inicializa nada
	}

	public static PersonaABM getInstancia() {
		if (instancia == null) {
			instancia = new PersonaABM();
		}
		return instancia;
	}

	public int agregar(String apellido, String nombre, int edad) throws Exception {
		PersonaDao personaDao = new PersonaDao();
		if (edad < 12)
			throw new Exception("La edad no puede ser menor a 12");
		return personaDao.agregar(new Persona(nombre, apellido, edad));
	}

	public Persona traer(int idPersona) {
		PersonaDao personaDao = new PersonaDao();
		return personaDao.traer(idPersona);
	}

	public List<Persona> traer() {
		PersonaDao personaDao = new PersonaDao();
		return personaDao.traer();
	}
}
