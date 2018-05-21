package com.souvik;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class EmployeeData {

	
	
	private	Map <Integer,Employee> m=new HashMap<Integer,Employee>();
		
	EmployeeData()
	{
		m.put(1,new Employee("Souvik","a@b.c","Banglore"));
		m.put(2,new Employee("Sou","a@b.c","Banglore"));
		m.put(3,new Employee("S","a@b.c","Banglore"));
	}

	public Map<Integer, Employee> getM() {
		return m;
	}



	public void setM(Map<Integer, Employee> m) {
		this.m = m;
	}

	public Employee getemp(int id) {
		// TODO Auto-generated method stub
		for(Map.Entry temp:m.entrySet()){  
			  //System.out.println(temp.getKey()+" "+temp.getValue());  
			  Employee emp=(Employee) temp.getValue();
			 
			  if(Integer.parseInt(temp.getKey().toString()) ==id)
			  {	  Employee e= new Employee(emp.getEmployeeName(),emp.getEmployeeEmail(),emp.getEmployeeLocation());
				  return e;
			  }
		}
		return null;
	}

	public void addemployee(int id, String name, String email, String locn) {
		// TODO Auto-generated method stub
		m.put(id, new Employee(name,email,locn));
	}

	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		m.remove(id);
	}
	
}
