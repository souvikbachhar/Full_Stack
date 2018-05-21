package com.souvik.assignments;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {


	     
		ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
	
		Student s1=(Student) context.getBean("student");
		s1.setStudentID("S001");
		s1.setStudentName("Steve");
		s1.addTest("T001","Core Java Test",80);
		System.out.println("ID: "+s1.getStudentID()+", Name :"+s1.getStudentName());
		System.out.println("Tests:");
		s1.showTest();
	
		
		Student s2=(Student) context.getBean("student");
		s2.setStudentID("S002");
		s2.setStudentName("Bve");
		s2.addTest("T001","Core Java Test",78);
		s2.addTest("T002","Python Test",79);
		System.out.println("ID: "+s2.getStudentID()+", Name :"+s2.getStudentName());
		System.out.println("Tests:");
		s2.showTest();
		
	}

}
