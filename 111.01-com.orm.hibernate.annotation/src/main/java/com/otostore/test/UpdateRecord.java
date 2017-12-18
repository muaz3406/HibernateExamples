package com.otostore.test;

import org.hibernate.Session;

import com.otostore.model.CarDetail;
import com.otostore.model.Vendor;
import com.otostore.session.HibernateSessionFactory;
import com.otostore.util.TimeStampFactory;

public class UpdateRecord {

	private static Session session = HibernateSessionFactory.getSessionFactory().openSession();
	public static void main(String[] args) {
		updateCarDetail();
		updateVendor();
	}
	public static void updateVendor() {
		Vendor vendor = new Vendor(3, "Alp", "Ercan", "Eclipse", null,
				TimeStampFactory.getCurrentTimeStamp());
		session.beginTransaction();
		session.update(vendor);
		session.getTransaction().commit();
		System.err.println(vendor);
		
	}
	public static void updateCarDetail() {
		CarDetail carDetail = new CarDetail(3, "Hacý", "Murat", 1986, null,
				TimeStampFactory.getCurrentTimeStamp());
		session.beginTransaction();
		session.update(carDetail);
		session.getTransaction().commit();
		System.err.println(carDetail);
		
	}

}
