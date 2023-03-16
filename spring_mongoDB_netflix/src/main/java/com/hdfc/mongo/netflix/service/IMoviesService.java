package com.hdfc.mongo.netflix.service;

import java.util.List;

import com.hdfc.mongo.netflix.entity.Movies;


public interface IMoviesService {

	public   Movies  addMovies(Movies m);
	
	public  Movies   updateMovies(Movies m);
	
	public      List<Movies>       getAllMovies();
	
	public  Movies   getMoviesById(int id);
	
	public  void    deleteMoviesById(int id);
	
	public  List<Movies>   getByname(String name);
}
