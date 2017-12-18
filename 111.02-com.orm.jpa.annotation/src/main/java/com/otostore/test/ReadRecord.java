package com.otostore.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.Query;

import org.hibernate.Session;

import com.otostore.model.CarDetail;
import com.otostore.model.Vendor;
import com.otostore.session.JpaEntityManagerFactory;

public class ReadRecord {

	private static EntityManager entityManager = JpaEntityManagerFactory.buildEntityManager();
	
	public static void main(String[] args) {
		readVendorByID(6);
		readVendorByQueryID(7);
		readVendorByQuery();
		
		readCarDetailByID(1);
		readCarDetailByQueryID(2);
		readCarDetailByQuery();
	}
	
	//GETTER ÝLE VERÝLERE ERÝÞÝM
	public static void readVendorByID(long id) {
		//SADECE GETTER METODU ÝLE SORGULAMA YAPTIK
		//HÝBERNATE TÜM QUERY LERÝ OLUÞTURUYOR.
		Vendor vendor = entityManager.find(Vendor.class, id);
		System.out.println(vendor);
	}
	 
	public static void readVendorByQueryID(long id){
		Query query = entityManager.createQuery("SELECT v FROM Vendor v WHERE v.id = :id");
		query.setParameter("id", id);
		Vendor vendor = (Vendor) query.getSingleResult();
		System.out.println(vendor);
	}
	
	public static void readVendorByQuery() {
		Query query = entityManager.createQuery("FROM Vendor");
		
		List<Vendor> vendors = query.getResultList();
		for (Vendor vendor : vendors) {
			System.out.println(vendor.getId() + " _ " + vendor.getFirm() + " _ "
					+ vendor.getName()+ " _ " + vendor.getSurName()+ " _ "
					+vendor.getAddDate()+ " _ " + vendor.getUpdateDate());
		}
	}
	
	public static void readCarDetailByID(long id) {
		CarDetail carDetail = entityManager.find(CarDetail.class, id);
		System.out.println(carDetail);
		
	}
	
	public static void readCarDetailByQueryID(long id){
		Query query = entityManager.createQuery("SELECT v FROM CarDetail v WHERE v.id = :id");
		query.setParameter("id", id);
		CarDetail carDetail = (CarDetail) query.getSingleResult();
		System.out.println(carDetail);
	}
	
	public static void readCarDetailByQuery() {
		Query query = entityManager.createQuery("FROM CarDetail");
		
		List<CarDetail> carDetails = query.getResultList();
		for (CarDetail carDetail : carDetails) {
			System.out.println(carDetail.getId() + " _ " + carDetail.getMarka() + " _ "
					+ carDetail.getModel()+ " _ " + carDetail.getYear()+ " _ "
					+carDetail.getAddDate()+ " _ " + carDetail.getUpdateDate());
		}
		
	}

}
