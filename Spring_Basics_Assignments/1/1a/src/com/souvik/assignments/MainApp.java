package com.souvik.assignments;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      Movie obj = (Movie) context.getBean("movie");
	      obj.getMovieId();
	      obj.getMovieName();
	      obj.getMovieActor();
	}

}
