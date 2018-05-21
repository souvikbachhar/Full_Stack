package com.souvik;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	
public class AppInit {
	
	
	public static void main (String args[]){
		
		SpringApplication.run(AppInit.class,args);
		
	}
}
