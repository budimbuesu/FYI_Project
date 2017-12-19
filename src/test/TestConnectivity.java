package test;

import java.math.BigDecimal;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.Session;

import dao.ClientHome;
import dao.CraHome;
import dao.HibernateUtil;
import dao.MissionHome;
import model.Client;
import model.Cra;

public class TestConnectivity {
	public static void main (String [] args) {
		BigDecimal id = new BigDecimal(1);
		System.out.println("Testing connectivity");
		
		ClientHome ch = new ClientHome();
		System.out.println(ch.getClientList().toString());
		
		Client client = new Client(new BigDecimal(78), "Alibek", "Jakupov");
		
		ch.saveOrUpdate(client);
		System.out.println("Update Successful");
	}
}
