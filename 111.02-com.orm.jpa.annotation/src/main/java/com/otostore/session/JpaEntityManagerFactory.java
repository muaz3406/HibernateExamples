package com.otostore.session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaEntityManagerFactory {
	
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	
	//entity manager nesnesi
	public static EntityManager buildEntityManager(){
		try {
			//persistence-unit name="PersistenceUnit"
			factory = Persistence.createEntityManagerFactory("PersistenceUnit");
			entityManager = factory.createEntityManager();
		} catch (Exception e) {
			System.err.println("entity manager çalýþtýrýlamadý");
		}
		return entityManager;
	}
	
	//transaction nesnesi
	public static EntityTransaction transaction(){
		return entityManager.getTransaction();
		
	}

}
