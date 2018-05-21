package com.souvik.assignments;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class AppConfig {
	@Bean(name="movie")
	public Movie getMovie(){
		Movie m=new Movie();
		m.setMovieId("1");
		m.setMovieName("3 idiots");
		m.setMovieActor("Amir");
		return  m;
	}
	
}