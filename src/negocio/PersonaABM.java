package negocio;

import java.util.List;

import dao.PersonaDao;
import modelo.Persona;

public class PersonaABM {

	private static PersonaDao instancia;
	private static PersonaABM instanciaABM;

	protected PersonaABM() {
		// this.inicializar(); Acá no se inicializa nada
	}

	public static PersonaDao getInstanciaDao() {
		if (instancia == null) {
			instancia = new PersonaDao();
		}
		return instancia;
	}
	
	public static PersonaABM getInstancia() {
		if (instanciaABM == null) {
			instanciaABM = new PersonaABM();
		}
		return instanciaABM;
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
	
	public void actualizar(Persona persona) throws Exception {
		if(getInstanciaDao().traer(persona.getApellido()) != null) {
			throw new Exception("No se puede duplicar el Apellido");
		}
		getInstanciaDao().actualizar(persona);
	}
	
	public void eliminar(Persona persona) {
		getInstanciaDao().eliminar(persona);
	}
}
