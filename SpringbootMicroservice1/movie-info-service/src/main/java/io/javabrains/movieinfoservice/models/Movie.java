package io.javabrains.movieinfoservice.models;

public class Movie {

//Class Variables	
	private String movieId;
	private String name;
	private String description;
	
//Constructors	
	
	public Movie(String movieId, String name) {
		this.movieId = movieId;
		this.name = name;
	}
	
    public Movie(String movieId, String name, String description) {
        this.movieId = movieId;
        this.name = name;
        this.description = description;
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
	
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
	
}
