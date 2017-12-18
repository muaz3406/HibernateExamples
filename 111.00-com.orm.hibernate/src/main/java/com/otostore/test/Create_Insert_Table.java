package com.otostore.test;

import org.hibernate.Session;

import com.otostore.model.CarDetail;
import com.otostore.model.Vendor;
import com.otostore.session.HibernateSessionFactory;
import com.otostore.util.TimeStampFactory;

public class Create_Insert_Table {

	private static Session session = HibernateSessionFactory.getSessionFactory().openSession();
	public static void main(String[] args) {
		createInsertTableCarDetail();
		createInsertTableVendor();
	}
	
	public static void createInsertTableCarDetail() {
		CarDetail carDetail = new CarDetail();
		carDetail.setMarka("tofaþ");
		carDetail.setModel("Murat");
		carDetail.setYear(1975);
		carDetail.setAddDate(TimeStampFactory.getCurrentTimeStamp());
		
		session.beginTransaction();
		session.save(carDetail);
		session.getTransaction().commit();
		
	}
	private static void createInsertTableVendor() {
		Vendor vendor = new Vendor();
		vendor.setName("muaz");
		vendor.setSurName("tastemel");
		vendor.setFirm("ORACLE");
		vendor.setAddDate(TimeStampFactory.getCurrentTimeStamp());
		
		session.beginTransaction();
		session.save(vendor);
		session.getTransaction().commit();
		
	}
	

}
