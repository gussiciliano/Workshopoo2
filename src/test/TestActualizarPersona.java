package test;

import modelo.Persona;
import negocio.PersonaABM;

public class TestActualizarPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Persona persona = PersonaABM.getInstancia().traer(7);
			persona.setApellido("Test Actualizar");
			PersonaABM.getInstancia().actualizar(persona);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
