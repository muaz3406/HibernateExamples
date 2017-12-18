package com.otostore.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.otostore.model.Vendor;
import com.otostore.session.JpaEntityManagerFactory;

public class Secure_PassingParameter {

	private static EntityManager entityManager = JpaEntityManagerFactory.buildEntityManager();
	public static void main(String[] args) {
		//unSecure_PassParameters("4");
		unSecure_PassParameters_HACKING("7");
	}

	public static void unSecure_PassParameters(String id){
		Query query = entityManager.createQuery("SELECT v FROM Vendor v WHERE v.id > " +id);
		//query.setParameter("id", Long.parseLong(id));
		
		List<Vendor> vendors = query.getResultList();
		for (Vendor vendor : vendors) {
			System.out.println(vendor.getId() + " _ " + vendor.getFirm() + " _ "
					+ vendor.getName()+ " _ " + vendor.getSurName()+ " _ "
					+vendor.getAddDate()+ " _ " + vendor.getUpdateDate());
		
	}
}
	
	public static void unSecure_PassParameters_HACKING(String id){
		id = id + "OR 1 = 1";
		Query query = entityManager.createQuery("SELECT v FROM Vendor v WHERE v.id > " +id);
		//query.setParameter("id", Long.parseLong(id));
		
		List<Vendor> vendors = query.getResultList();
		for (Vendor vendor : vendors) {
			System.out.println(vendor.getId() + " _ " + vendor.getFirm() + " _ "
					+ vendor.getName()+ " _ " + vendor.getSurName()+ " _ "
					+vendor.getAddDate()+ " _ " + vendor.getUpdateDate());
		
	}
}
	
}
