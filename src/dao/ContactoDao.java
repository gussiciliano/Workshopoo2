package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import modelo.Contacto;

public class ContactoDao {
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

	public int agregar(Contacto contacto) {
		int id = 0;
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(contacto).toString());
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
		return id;
	}

	public Contacto traer(long idContacto) throws HibernateException {
		Contacto objeto = null;
		try {
			iniciaOperacion();
			objeto = (Contacto) session.get(Contacto.class, idContacto);
		} finally {
			session.close();
		}
		return objeto;
	}
	
}