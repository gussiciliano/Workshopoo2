package test;

import modelo.Persona;
import modelo.Programador;
import modelo.Tester;

public class Herencia {
	public static void main(String[] args) {
		Persona dev = new Programador("ape", "nom", 23, 23);
		dev.calcularSueldo();
		Persona qa1 = new Tester("ape", "nom", 23, 23, 10);
		qa1.calcularSueldo();
		Persona qa2 = new Tester("ape", "nom", 23, 23, 10);
		qa2.calcularSueldo();
		Persona qa3 = new Tester("ape", "nom", 23, 23, 10);
		qa3.calcularSueldo();
	}
}
