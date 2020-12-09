package io.javabrains.moviecatalogservice.models;

public class Rating {

//Class Variables
	private String movieId;
	private int rating;

//Constructors

	public Rating() {
		
	}
	
	
	public Rating(String movieId, int rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}


//Getters and Setters
	
	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
