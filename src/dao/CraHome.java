   package dao;
// Generated Nov 8, 2016 8:50:54 AM by Hibernate Tools 3.5.0.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import model.Cra;

/**
 * Home object for domain model class Cra.
 * @see dao.Cra
 * @author Hibernate Tools
 */
public class CraHome {
	public CraHome () {}

	public List<Cra> getListCra() {
		List<Cra> results = null;

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		results = session.createQuery("from Cra").list();

		session.close();

		return results;
	}
}
