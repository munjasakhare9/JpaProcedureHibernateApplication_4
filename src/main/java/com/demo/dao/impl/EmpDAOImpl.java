package com.demo.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import com.demo.dao.EmpDAO;

public class EmpDAOImpl implements EmpDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public void executeProcedure(int empno) {
		EntityManager em = factory.createEntityManager();
		StoredProcedureQuery query = em.createNamedStoredProcedureQuery("proc1");
		query.setParameter("eno", empno);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		String s1 = (String) query.getOutputParameterValue("name");
		Integer d = (Integer) query.getOutputParameterValue("experience");
		tx.commit();
		System.out.println("Employee Name :: " + s1);
		System.out.println("Employee Experience :: " + d);
		em.close();
		factory.close();
	}

}
