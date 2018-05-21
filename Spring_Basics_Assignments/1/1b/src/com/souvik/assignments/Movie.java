package com.souvik.assignments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Movie {

	private String movieId;
	private String movieName;
	private String movieActor;
	public String getMovieId() {
		System.out.println(movieId);
		return movieId;
	}
	
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		System.out.println(movieName);
		return movieName;
	}
	
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieActor() {
		System.out.println(movieActor);
		return movieActor;
	}
	
	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}

	
}
