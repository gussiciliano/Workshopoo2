package modelo;

import java.time.LocalDate;

public class Persona {

	private long idPersona;
	private String nombre;
	private String apellido;
	private LocalDate fechaDeNacimiento;
	private int edad;
	private Contacto contacto;
	private double sueldoBase; // Debería estar por ejemplo en una sub clase Empleado
	
	public Persona() {}
	
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.setEdad(edad);
	}
	
	public Persona(String nombre, String apellido, int edad, double sueldoBase) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.setEdad(edad);
		this.sueldoBase = sueldoBase;
	}

	public double calcularSueldo() {
		return this.sueldoBase;
	}
	
	public long getIdPersona() {
		return idPersona;
	}
	protected void setIdPersona(long idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaDeNacimiento=" + fechaDeNacimiento + ", edad=" + edad + ", contacto="  + contacto + "]";
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
}
