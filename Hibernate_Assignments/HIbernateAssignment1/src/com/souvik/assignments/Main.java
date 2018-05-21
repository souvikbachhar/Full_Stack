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
		emp.setEmpno(1);
		
		SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory(); 
	    Session session=factory.openSession();  
	    Transaction t=session.beginTransaction(); 
	    System.out.println("Inserting values using save.....");
	    session.save(emp);
	    System.out.println("Reading value using get.....");
	    emp=(Employee)session.get(Employee.class, 1);	
	    System.out.println("Emp name:"+emp.getName());
	    emp.setName("schanged");
	    emp=(Employee)session.get(Employee.class, 1);	
	    System.out.println("After updating value,name:"+emp.getName());
	    session.delete(emp);
	    System.out.println("Entry deleted");
	    t.commit();
	    session.close();
	    
	    System.out.println("Done");
	}

}
