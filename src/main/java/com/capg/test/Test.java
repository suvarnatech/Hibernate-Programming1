package com.capg.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.capg.configuration.Configuration;
import com.capg.model.Address;
import com.capg.model.Employee;

public class Test {

	public static void main(String[] args) {
		SessionFactory sessionFactory = Configuration.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Address address = new Address();
		address.setPinCode("574143");
		address.setState("Karnataka");
		address.setStreet("EPIP");

		Employee employee = new Employee();
		employee.setEmployeeName("Sukanya");
		employee.setAddress(address);
		session.save(employee);
		session.beginTransaction().commit();
		session.close();
	}
	

}
