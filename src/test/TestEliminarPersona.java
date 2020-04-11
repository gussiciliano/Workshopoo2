package test;

import modelo.Persona;
import negocio.PersonaABM;

public class TestEliminarPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Persona persona = PersonaABM.getInstancia().traer(1);
			PersonaABM.getInstancia().eliminar(persona);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
