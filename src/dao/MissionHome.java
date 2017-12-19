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

import model.Mission;
import model.Salarie;

/**
 * Home object for domain model class Mission.
 * @see dao.Mission
 * @author Hibernate Tools
 */
public class MissionHome {
	public MissionHome() {}
	
	public List<Mission> getMissions() {
		List<Mission> results = null;
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		results = session.createQuery("from Mission").list();
		
		session.close();
		
		return results;
	}
}
