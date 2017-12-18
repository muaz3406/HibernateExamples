package com.otostore.test;

import org.hibernate.Session;
import com.otostore.session.HibernateSessionFactory;

public class Create_Table {
	
	private static Session session = HibernateSessionFactory.getSessionFactory().openSession();
	public static void main(String[] args) {
		
	}

}
