package modelo;

public class Contacto {
	private long idContacto;
	private String direccion;
	private Persona persona;
	
	public Contacto() {}
	
	public Contacto(String direccion, Persona persona) {
		super();
		this.direccion = direccion;
		this.persona = persona;
	}
	
	public long getIdContacto() {
		return idContacto;
	}
	protected void setIdContacto(long idContacto) {
		this.idContacto = idContacto;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Contacto [idContacto=" + idContacto + ", direccion=" + direccion + "]";
	}	
}
