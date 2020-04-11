package modelo;

import java.util.Set;

public class Prestamo {

	private long idPrestamo;
	private double monto;
	private Persona persona;
	private Set<Cuota> cuotas;
	
	public Prestamo() {}
	
	public Prestamo(double monto, Persona persona, Set<Cuota> cuotas) {
		super();
		this.monto = monto;
		this.persona = persona;
		this.cuotas = cuotas;
	}

	public long getIdPrestamo() {
		return idPrestamo;
	}

	protected void setIdPrestamo(long idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Set<Cuota> getCuotas() {
		return cuotas;
	}

	public void setCuotas(Set<Cuota> cuotas) {
		this.cuotas = cuotas;
	}
}
