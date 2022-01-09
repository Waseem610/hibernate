package com.te.hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			
			System.out.println("Enter id");
			int id=scanner.nextInt();
			if(id==0) {
				break;
			}
			System.out.println("Enter Name");
			String name=scanner.next();
			System.out.println("Enter Designation");
			String designation=scanner.next();
			System.out.println("Enter Salary");
			double sal=scanner.nextDouble();
		Team player = new Team();
		player.setId(id);
		player.setName(name);
		player.setDesignation(designation);
		player.setSalary(sal);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("team");
		EntityManager createEntityManager = emf.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(player);
		transaction.commit();
		
		}
	}

}
