package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory(null);
		EntityManager em = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
//		Team player = createEntityManager.find(Team.class,18);
//		System.out.println(player);
		Team vk = em.find(Team.class, 18);
		transaction.begin();
		em.remove(vk);
		transaction.commit();
		
		//update the data
		Team kl = em.find(Team.class, 1);
		if(kl!=null) {
			transaction.begin();
			kl.setDesignation("VC");
			transaction.commit();
		}
		
		
	}

}
