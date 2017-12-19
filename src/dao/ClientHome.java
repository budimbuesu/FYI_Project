package dao;
// Generated Nov 8, 2016 8:50:54 AM by Hibernate Tools 3.5.0.Final

import java.util.ArrayList;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import model.Client;

/**
 * Home object for domain model class Client.
 * @see dao.Client
 * @author Hibernate Tools
 */
public class ClientHome {
	public ClientHome() {}
	
	public List<Client> getClientList() {
		List<Client> result;
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		result = (List<Client>) session.createQuery("from Client").list();
		
		session.close();
		
		return result;
	
	}
	
	public void saveOrUpdate (Client client) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.saveOrUpdate(client);
		session.getTransaction().commit();
		session.close();
	}
}
