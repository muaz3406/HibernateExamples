package com.otostore.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.hibernate.Session;

import com.otostore.model.CarDetail;
import com.otostore.model.Vendor;
import com.otostore.session.JpaEntityManagerFactory;
import com.otostore.util.TimeStampFactory;

public class Create_Insert_Table {

	private static EntityManager entityManager = JpaEntityManagerFactory.buildEntityManager();
	private static EntityTransaction transaction = JpaEntityManagerFactory.transaction();
	
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
		
		transaction.begin();
		entityManager.persist(carDetail);
		transaction.commit();
		
	}
	private static void createInsertTableVendor() {
		Vendor vendor = new Vendor();
		vendor.setName("faik");
		vendor.setSurName("turan");
		vendor.setFirm("ismek");
		vendor.setAddDate(TimeStampFactory.getCurrentTimeStamp());
		
		transaction.begin();
		entityManager.persist(vendor);
		transaction.commit();
		
		
	}
	

}
