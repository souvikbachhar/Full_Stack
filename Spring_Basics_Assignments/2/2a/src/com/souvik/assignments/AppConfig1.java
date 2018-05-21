package com.souvik.assignments;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope("prototype")
public class AppConfig1 {
	@Bean(name="student")
	public Student getStudent(){
		Student s=new Student();
		return s;
	}
	@Bean(name="Test")
	public Test getTest(){
		Test s=new Test();
		return s;
	}
}
