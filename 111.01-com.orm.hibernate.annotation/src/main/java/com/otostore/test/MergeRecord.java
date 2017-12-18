package com.otostore.test;

import org.hibernate.Session;

import com.otostore.model.CarDetail;
import com.otostore.model.Vendor;
import com.otostore.session.HibernateSessionFactory;
import com.otostore.util.TimeStampFactory;

public class MergeRecord {

	private static Session session = HibernateSessionFactory.getSessionFactory().openSession();
	public static void main(String[] args) {
		mergeVendor();
		mergeCarDetail();

	}
	public static void mergeCarDetail() {
		CarDetail carDetail = new CarDetail(1, "Mercedes", "C180", 2017, null, 
				TimeStampFactory.getCurrentTimeStamp());
		session.beginTransaction();
		session.merge(carDetail);
		session.getTransaction().commit();
		
	}
	public static void mergeVendor() {
		Vendor vendor = new Vendor(1, "Ali", "Gel", "Java", 
				//TimeStampFactory.getCurrentTimeStamp(), TimeStampFactory.getCurrentTimeStamp());
		//Vendor vendor2 = new Vendor(0, "Veli", "Git", "Oracle", 
				TimeStampFactory.getCurrentTimeStamp(), TimeStampFactory.getCurrentTimeStamp());
		
		session.beginTransaction();
		//session.saveOrUpdate(vendor2);
		session.merge(vendor);
		session.getTransaction().commit();
		
	}

}
