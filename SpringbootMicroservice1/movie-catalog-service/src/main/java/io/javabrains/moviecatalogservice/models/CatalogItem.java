package io.javabrains.moviecatalogservice.models;

public class CatalogItem {

//Class Variables
	private String name;
	private String description;
	private int rating;

//Constructors
	public CatalogItem(String name, String description, int rating) {
		this.name = name;
		this.description = description;
		this.rating = rating;
	}
	
//Getters and Setters	
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
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
