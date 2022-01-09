package com.te.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("team");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		String query="from IndiaTeam ";
		Query createQuery = createEntityManager.createQuery(query);
		List<Team> resultList = createQuery.getResultList();
		resultList.forEach(System.out::println);
		
		//getting a single result
		String query1="Select min(salary) from IndiaTeam";
		Query createQuery2 = createEntityManager.createQuery(query1);
		Object singleResult = createQuery2.getSingleResult();
		System.out.println(singleResult);
		
		//updating the data
		EntityTransaction transaction = createEntityManager.getTransaction();
		String query2="update IndiaTeam set salary=190000 where id=7";
		transaction.begin();
		Query createQuery3 = createEntityManager.createQuery(query2);
		int executeUpdate = createQuery3.executeUpdate();
		transaction.commit();
		
		//query to delete the data
		transaction.begin();
		String query3="delete IndiaTeam where id=3";
		Query createQuery4 = createEntityManager.createQuery(query3);
		int executeUpdate2 = createQuery4.executeUpdate();
		transaction.commit();
		
		String query4="from IndiaTeam where salary=(select min(salary) from IndiaTeam)";
		Query createQuery5 = createEntityManager.createQuery(query4);
		Object singleResult2 = createQuery5.getSingleResult();
		System.out.println(singleResult2);
		
		//creating dynamic query
		String query5="update IndiaTeam set salary=:sal where id=:od";
		transaction.begin();
		Query createQuery6 = createEntityManager.createQuery(query5);
		createQuery6.setParameter("sal", 320.0);
		createQuery6.setParameter("od", 1);
		int executeUpdate3 = createQuery6.executeUpdate();
		transaction.commit();
		
	}

}
