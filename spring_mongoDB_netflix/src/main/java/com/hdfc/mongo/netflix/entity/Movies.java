package com.hdfc.mongo.netflix.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Document(collection = "movies")
public class Movies {

	@Id
	private int id;
	private String name;
	private int rating;
	
	public Movies() {
		super();
	}
	
	public Movies(int id, String name, int rating) {
		this.id=id;
		this.name=name;
		this.rating=rating;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
}
