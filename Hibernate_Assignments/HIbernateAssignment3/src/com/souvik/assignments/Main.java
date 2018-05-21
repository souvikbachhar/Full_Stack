package com.souvik.assignments;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setName("souvik");
		
		EmployeePassport emppass =new EmployeePassport();
		emppass.setEmppassport("XYZ");
		
		emppass.setEmpdata(emp);
		
		SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory(); 
	    Session session=factory.openSession();  
	    Transaction t=session.beginTransaction(); 
	    session.save(emppass);
	    
	    t.commit();
	    session.close();
	    
	    System.out.println("Done");
	}

}
