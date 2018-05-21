package com.souvik.hibernate;

import org.apache.log4j.PropertyConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.objectweb.asm.attrs.Annotation;

public class Main {

	public static void main(String[] args) {
		
		
		Course c1=new Course();
		c1.setCoursename("Java");
		
		Course c2=new Course();
		c2.setCoursename(".Net");
		
		Student s1=new Student();
		s1.setName("s1");
		(s1.getCourses()).add(c1);
		
		Student s2=new Student();
		s2.setName("s2");
		(s2.getCourses()).add(c2);
		
	    SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory(); 
	    Session session=factory.openSession();  
	    Transaction t=session.beginTransaction(); 
	    
	    session.save(s1);
	    session.save(s2);

	    t.commit();
	    session.close();
	
	    System.out.print("Done");
	}

}
