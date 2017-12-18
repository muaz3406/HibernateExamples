package com.otostore.test;

import org.hibernate.Session;

import com.otostore.model.Vendor;
import com.otostore.session.HibernateSessionFactory;

public class DeleteRecord {

	private static Session session = HibernateSessionFactory.getSessionFactory().openSession();
	public static void main(String[] args) {
		deleteVendor();

	}
	
	public static void deleteVendor() {
		Vendor vendor = new Vendor();
		vendor.setId(2);
		
		session.beginTransaction();
		session.delete(vendor);
		session.getTransaction().commit();
		
	}

}
