package modelo;

public class Cuota {
	private long idCuota;
	private double valor;
	private Prestamo prestamo;
	
	public Cuota() {}
	
	public Cuota(double valor, Prestamo prestamo) {
		super();
		this.valor = valor;
		this.prestamo = prestamo;
	}

	public long getIdCuota() {
		return idCuota;
	}

	protected void setIdCuota(long idCuota) {
		this.idCuota = idCuota;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Prestamo getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}
}
