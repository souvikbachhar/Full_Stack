package com.souvik.assignments;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee();  
	    e1.setEmployeeName("Souvik"); 
	    e1.setEmployeeSalary(5000);
	    
	    RegularEmployee e2=new RegularEmployee();  
	    e2.setEmployeeName("Vivek Kumar");  
	    e2.setEmployeeSalary(50000);  
	    e2.setQplc(500);  
	    
	    ContractEmployee e3=new ContractEmployee();  
	    e3.setEmployeeName("Kumar");  
	    e3.setEmployeeSalary(50);  
	    e3.setAllowance(3000000);  
		
		SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory(); 
	    Session session=factory.openSession();  
	    Transaction t=session.beginTransaction(); 
	    
	    session.save(e1);
	    session.save(e2);
	    session.save(e3);
	    
	    t.commit();
	    session.close();
	    
	    System.out.println("Done");
	}

}
