package com.capg.configuration;

import org.hibernate.SessionFactory;

public class Configuration {

	private Configuration() {

	}

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		
		return sessionFactory;

	}

}
