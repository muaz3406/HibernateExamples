package com.otostore.test;

import java.sql.Timestamp;

import org.hibernate.Session;

import com.otostore.model.CarDetail;
import com.otostore.model.Vendor;
import com.otostore.session.HibernateSessionFactory;
import com.otostore.util.TimeStampFactory;

public class SaveOrUpdate {

	private static Session session = HibernateSessionFactory.getSessionFactory().openSession();
	public static void main(String[] args) {
		saveOrUpdateVendor();
		saveOrUpdateCarDetail();

	}
	public static void saveOrUpdateCarDetail() {
		CarDetail carDetail = new CarDetail(6, "bmw", "X5", 2018, null, 
				TimeStampFactory.getCurrentTimeStamp());
		
		session.beginTransaction();
		session.saveOrUpdate(carDetail);
		session.getTransaction().commit();
		
		
	}
	public static void saveOrUpdateVendor() {
		Vendor vendor = new Vendor(1, "Ali", "Gel", "Java", 
				//TimeStampFactory.getCurrentTimeStamp(), TimeStampFactory.getCurrentTimeStamp());
		//Vendor vendor2 = new Vendor(0, "Veli", "Git", "Oracle", 
				TimeStampFactory.getCurrentTimeStamp(), TimeStampFactory.getCurrentTimeStamp());
		
		session.beginTransaction();
		//session.saveOrUpdate(vendor2);
		session.saveOrUpdate(vendor);
		session.getTransaction().commit();
		
		
		
	}

}
