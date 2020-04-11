package test;

import negocio.PersonaABM;

public class TestAgregarPersona {

	public static void main(String[] args) {
		// 1 agregar una persona
		try {
			System.out.print("Id resultado: " + PersonaABM.getInstancia().agregar("Apellido", "Generic", 14));
			System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
