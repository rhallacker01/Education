package io.javabrains.moviecatalogservice.models;

public class Movie {

//Class Variables	
	private String movieId;
	private String name;
	
//Constructors	
	
	public Movie() {
		
	} //Empty Constructor used for unmarshaling data to movie class - in MovieCatalogResource
	
	public Movie(String movieId, String name) {
		this.movieId = movieId;
		this.name = name;
	}
	
	
//Getters and Setters	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
