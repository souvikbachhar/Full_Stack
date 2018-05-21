package com.souvik.ass3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
	static Logger logger = Logger.getLogger(MainApp.class.getName());

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList <Student> stud=new ArrayList<Student>();
		ApplicationContext context =new ClassPathXmlApplicationContext("Bean3.xml");
		
		Student s=(Student) context.getBean("student");
		for (int i=1;i<101;i++)
		{
			
			Student s1=(Student) context.getBean("student");	
			s1.setStudentId(i+"");
			s1.setStudentName("s"+i);
		
			stud.add(s1);
		}
		s.getAllDetails(stud);
		System.out.println("Enter ID to fetch data");
		//logger.info("XXXXXXXXXXXXXXXXXXXX");
		String fetchID=br.readLine();
		s.getDetails(stud,fetchID);
		
		
	}

	

}
