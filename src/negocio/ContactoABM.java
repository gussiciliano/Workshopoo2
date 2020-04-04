package negocio;

import dao.ContactoDao;
import modelo.Contacto;
import modelo.Persona;

public class ContactoABM {
	ContactoDao contactoDao = new ContactoDao();
	
	public int agregar(String direccion, Persona persona) {
		return contactoDao.agregar(new Contacto(direccion, persona));
	}
	
	public Contacto traer(int idContacto) {
		return contactoDao.traer(idContacto);
	}
}
