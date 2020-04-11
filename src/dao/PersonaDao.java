package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import modelo.Persona;

public class PersonaDao { // Poner 'extends Dao<Persona>' para probar Generics con la Herencia de Dao
	private static Session session;
	private Transaction tx;

	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	private void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}

	@SuppressWarnings("unchecked")
	public List<Persona> traer() throws HibernateException {
		List<Persona> lista = null;
		try {
			iniciaOperacion();
			lista = session.createQuery("from Persona p inner join fetch p.contacto c where  c.direccion = 'Calle 22'")
					.list();
		} finally {
			session.close();
		}
		return lista;
	}

	public Persona traer(String apellido) throws HibernateException {
		Persona persona = null;
		try {
			iniciaOperacion();
			persona = (Persona) session.createQuery("from Persona p where p.apellido = '" + apellido + "'")
					.uniqueResult();
		} finally {
			session.close();
		}
		return persona;
	}

	public int agregar(Persona persona) {
		int id = 0;
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(persona).toString());
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
		return id;
	}

	public Persona traer(long idPersona) throws HibernateException {
		Persona objeto = null;
		try {
			iniciaOperacion();
			objeto = (Persona) session.get(Persona.class, idPersona);
		} finally {
			session.close();
		}
		return objeto;
	}
	
	public void actualizar(Persona objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
	}

	public void eliminar(Persona persona) throws HibernateException {
		try {
			iniciaOperacion();
			session.delete(persona.getContacto());
			session.delete(persona);
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
	}

}