package modelo;

public class Tester extends Persona {

	private int multiplicador;

	public Tester(String nombre, String apellido, int edad, double sueldoBase, int mutiplicador) {
		super(nombre, apellido, edad, sueldoBase);
		this.multiplicador = mutiplicador;
	}
	
	@Override
	public double calcularSueldo() {
		return getSueldoBase() + (getSueldoBase() * this.multiplicador / 100);
	}
	
	public int getMultiplicador() {
		return multiplicador;
	}

	public void setMultiplicador(int multiplicador) {
		this.multiplicador = multiplicador;
	}
}
