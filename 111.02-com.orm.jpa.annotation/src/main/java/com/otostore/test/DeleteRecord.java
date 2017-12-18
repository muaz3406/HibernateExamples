package com.otostore.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.Session;

import com.otostore.model.Vendor;
import com.otostore.session.JpaEntityManagerFactory;

public class DeleteRecord {

	private static EntityManager entityManager = JpaEntityManagerFactory.buildEntityManager();
	private static EntityTransaction transaction = JpaEntityManagerFactory.transaction();
	
	public static void main(String[] args) {
		//deleteVendor();
		//deleteVendorByID(2);
		//deleteVendorByQueryID(3);
		deleteVendorByQuery(4);
	}
	
	public static void deleteVendor() {
		Vendor vendor = entityManager.find(Vendor.class, (long) 1);

		
		transaction.begin();
		entityManager.remove(vendor);
		transaction.commit();
	}
	
	public static void deleteVendorByID(long id){
		Vendor vendor = entityManager.find(Vendor.class, id);
		
		transaction.begin();
		if (vendor != null) {
			entityManager.remove(vendor);
			transaction.commit();
		}
	}
	
	public static void deleteVendorByQueryID(long id){
		Query query = entityManager.createQuery("DELETE Vendor WHERE id = :id");
		
		transaction.begin();
		query.setParameter("id", id);
		query.executeUpdate();
		transaction.commit();
	}
	
	public static void deleteVendorByQuery(long Vendor_ID){
		Query query = entityManager.createQuery("DELETE Vendor WHERE Vendor_ID = :Vendor_ID");
		
		transaction.begin();
		query.setParameter("Vendor_ID", Vendor_ID);
		query.executeUpdate();
		transaction.commit();
	}

}
