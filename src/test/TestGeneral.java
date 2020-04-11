package test;

import negocio.ContactoABM;
import negocio.PersonaABM;

public class TestGeneral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 agregar una persona 
		try {
			System.out.print("Id resultado: " + PersonaABM.getInstancia().agregar("Apellido", "Nombre134", 14));
			System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//2 agregar una persona incorrecta
		try {
			System.out.print("Id resultado: " + PersonaABM.getInstancia().agregar("Apellido", "Nombre1", 9));
			System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 3 agregar un contacto a la persona 1
		ContactoABM contactoABM = new ContactoABM();
		try {
			System.out.print("Id resultado: " + contactoABM.agregar("Calle 123", PersonaABM.getInstancia().traer(34)));
			System.out.print("Id resultado: " + contactoABM.agregar("Calle 123", PersonaABM.getInstancia().traer(35)));
			System.out.print("Id resultado: " + contactoABM.agregar("Calle 22", PersonaABM.getInstancia().traer(36)));
			System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//ContactoABM contactoABM2 = new ContactoABM();
		try {
			System.out.println(PersonaABM.getInstancia().traer(34));
			//System.out.println(contactoABM2.traer(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ContactoABM contactoABM3 = new ContactoABM();
		try {
			System.out.println(PersonaABM.getInstancia().traer());
			System.out.println(contactoABM3.traer(34));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
