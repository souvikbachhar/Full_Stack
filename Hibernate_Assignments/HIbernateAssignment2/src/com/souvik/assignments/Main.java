package com.souvik.assignments;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dept=new Department();
		dept.setDeptname("Abc");
		
		Employee emp1=new Employee();
		emp1.setName("s1");
		emp1.setDepartment(dept);
		
		Employee emp2=new Employee();
		emp2.setName("s2");
		emp2.setDepartment(dept);
		
		SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory(); 
	    Session session=factory.openSession();  
	    Transaction t=session.beginTransaction(); 
	    
	    session.save(emp1);
	    session.save(emp2);
	    
	    t.commit();
	    session.close();
	    
	    System.out.println("Done");
	}

}
