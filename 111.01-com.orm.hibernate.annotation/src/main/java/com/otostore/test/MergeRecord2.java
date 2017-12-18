package com.otostore.test;

import org.hibernate.Session;

import com.otostore.model.Vendor;
import com.otostore.session.HibernateSessionFactory;
import com.otostore.util.TimeStampFactory;

public class MergeRecord2 {

	private static Session session1 = HibernateSessionFactory.getSessionFactory().openSession();
	private static Session session2 = HibernateSessionFactory.getSessionFactory().openSession();
	private static Session session3 = HibernateSessionFactory.getSessionFactory().openSession();
	private static Session session4 = HibernateSessionFactory.getSessionFactory().openSession();
	
	public static void main(String[] args) {
		 Vendor vendor1 = new Vendor(1, "merge", "metot", "test", null,
				 TimeStampFactory.getCurrentTimeStamp());
		 
		 Vendor vendor2 = new Vendor(2, "update", "metot", "test", null,
				 TimeStampFactory.getCurrentTimeStamp());
		 
		 session1.getSessionFactory().close();
		 System.out.println("session1.getSessionFactory().close();");
		 
		 //MERGE
		 session2.beginTransaction();
		 session2.merge(vendor1);
		 session2.getTransaction().commit();
		 session2.getSessionFactory().close();
		 
		 session3.getSessionFactory().close();
		 System.out.println("session1.getSessionFactory().close();");
		 
		 //UPDATE
		 session4.beginTransaction();
		 session4.update(vendor2);
		 session4.getTransaction().commit();
		 session4.getSessionFactory().close();
		 

	}

}
