package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo {
public static void main(String[] args) {
	Team team=new Team();
	team.setId(420);
	team.setDesignation("batsman");
	team.setName("waseem");
	team.setSalary(100000);
	EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("team");
	EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
	EntityTransaction transaction = createEntityManager.getTransaction();
	transaction.begin();
	createEntityManager.persist(team);
	transaction.commit();
}
}
