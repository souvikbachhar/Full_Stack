package com.souvik.ass3;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
//	public Student(String StudentId, String StudentName) {
//		this.StudentId=StudentId;
//		this.stude
//	}
	public String getStudentId() {
		return StudentId;
	}
	public void setStudentId(String studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	String StudentId;
	String StudentName;
	
	
	public void getAllDetails(ArrayList<Student> stud) {
		// TODO Auto-generated method stub
		stud.forEach(t -> System.out.println("Test ID : "+t.getStudentId()+", Name : "+t.getStudentName())); 
		
	}
	public void getDetails(ArrayList<Student> stud,String fetchID) {
		// TODO Auto-generated method stub
		Iterator<Student> itr=stud.iterator();
		while(itr.hasNext())
		{
			Student std= itr.next();
			if(std.getStudentId().equals(fetchID)){
				System.out.println(std.getStudentName());
			}
		}
	}

	
}
