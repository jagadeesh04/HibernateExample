package com.jag.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	
	public static void main(String[] args) {
		
		Student_Info info = new Student_Info();
		Student_Info info1 = new Student_Info();
		
		info.setName("jag");
//		info.setRollNo(1);
		info.setBirthDate(new Date());
		info.setExisting(true);
		
		info1.setName("ram");
//		info1.setRollNo(1);
		info1.setBirthDate(new Date());
		info1.setExisting(false);
		
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(info);
		session.save(info1);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}
	
}
