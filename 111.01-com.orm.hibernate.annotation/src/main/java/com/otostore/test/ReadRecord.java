package com.otostore.test;

import java.util.List;

import javax.persistence.Id;

import org.hibernate.Session;

import com.otostore.model.CarDetail;
import com.otostore.model.Vendor;
import com.otostore.session.HibernateSessionFactory;

public class ReadRecord {

	private static Session session = HibernateSessionFactory.getSessionFactory().openSession();
	public static void main(String[] args) {
		readVendorByID(1);
		readVendorByQuery();
		
		readCarDetailByID(1);
		readCarDetailByQuery();
	}
	
	//GETTER ÝLE VERÝLERE ERÝÞÝM
	public static void readVendorByID(long id) {
		//SADECE GETTER METODU ÝLE SORGULAMA YAPTIK
		//HÝBERNATE TÜM QUERY LERÝ OLUÞTURUYOR.
		Vendor vendor = (Vendor)session.get(Vendor.class, id);
		System.out.println(vendor);
	}
	public static void readVendorByQuery() {
		List<Vendor> vendors = session.createQuery("from Vendor").list();
		
		System.out.println("Vendor sayýsý: " + vendors.size());
		
		for (Vendor vendor : vendors) {
			System.out.println(vendor.getId() + " _ " + vendor.getFirm() + " _ "
					+ vendor.getName()+ " _ " + vendor.getSurName()+ " _ "
					+vendor.getAddDate()+ " _ " + vendor.getUpdateDate());
		}
	}
	
	public static void readCarDetailByID(long id) {
		CarDetail carDetail = (CarDetail)session.get(CarDetail.class, id);
		System.out.println(carDetail);
		
	}
	public static void readCarDetailByQuery() {
List<CarDetail> carDetails = session.createQuery("from CarDetail").list();
		
		System.out.println("CarDetail sayýsý: " + carDetails.size());
		
		for (CarDetail carDetail : carDetails) {
			System.out.println(carDetail.getId() + " _ " + carDetail.getMarka() + " _ "
					+ carDetail.getModel()+ " _ " + carDetail.getYear()+ " _ "
					+carDetail.getAddDate()+ " _ " + carDetail.getUpdateDate());
		}
		
	}

}
