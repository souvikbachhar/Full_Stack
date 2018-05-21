package com.souvik.assignments;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {


	public String getStudentID() {
		return studentID;
	}
	
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public ArrayList<Test> getTe() {
		return te;
	}

	public void setTe(ArrayList<Test> te) {
		this.te = te;
	}

	private String studentID;
	private String studentName;
    private ArrayList<Test> te=new ArrayList<Test>();
    
    
    private Test test;

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public void addTest(String id,String title,int marks){
	//	Test test=new Test();
		ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
		Test test=(Test) context.getBean("Test");
		test.setTestId(id);
		test.setTestTitle(title);
		test.setTestMarks(marks);
		te.add(test);
	}

	public void showTest(){
		te.forEach(t -> System.out.println("Test ID : "+t.getTestId()+", Title : "+t.getTestTitle()+", Marks : "+t.getTestMarks())); 
	}
}
