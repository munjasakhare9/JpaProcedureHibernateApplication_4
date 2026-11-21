package com.demo.client;

import com.demo.dao.EmpDAO;
import com.demo.dao.impl.EmpDAOImpl;

public class Tester {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAOImpl();
		dao.executeProcedure(103);
	}
}
