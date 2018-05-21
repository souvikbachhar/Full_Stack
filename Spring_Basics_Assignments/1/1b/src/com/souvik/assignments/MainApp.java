package com.souvik.assignments;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {

	      ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		  Movie obj = context.getBean("movie", Movie.class);
	      obj.getMovieId();
	      obj.getMovieName();
	      obj.getMovieActor();
	}

}
