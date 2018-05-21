package com.souvik.assignments;

public class Movie {

	private String movieId;
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
	private String movieName;
	private String movieActor;
	
}
