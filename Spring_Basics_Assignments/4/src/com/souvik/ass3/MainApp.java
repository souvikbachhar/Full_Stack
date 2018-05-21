package com.souvik.ass3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
@Configuration
@ComponentScan("com.souvik.ass3")
public class MainApp {
	
 
	
	static Logger logger = Logger.getLogger(MainApp.class.getName());

	public static void main(String[] args) throws IOException{
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MainApp.class);
		DataBaseConfig dataBaseConfig = context.getBean("DataBaseConfig", DataBaseConfig.class);
		StudentRepo studentRepo = context.getBean("StudentRepo", StudentRepo.class);
		
		studentRepo.getAllDetails();
		
	}

}
