package test;


import negocio.PersonaABM;
import negocio.PrestamoABM;

public class TestAgregarPrestamo {

	public static void main(String[] args) {
	
		PrestamoABM.getInstancia().agregar(80000, PersonaABM.getInstancia().traer(3));
		
	}

}
