package com.otostore.session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
	private static SessionFactory buildSessionFactory(){
		try {
			//hibernate.cfg.xml yardımı ile SessionFactory yaratılır.
			return new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("SessionFactory yaratılamadı...."+ex);
			throw new ExceptionInInitializerError(ex);
		}
		
	}
	
	//SessionFactory nesnesi
			public static SessionFactory getSessionFactory(){
				SessionFactory sessionFactory = buildSessionFactory();
				return sessionFactory;
			}
			
			
			public static void closeSession(){
				getSessionFactory().close();
			}
			
}





