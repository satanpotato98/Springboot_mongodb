package com.hdfc.mongo.netflix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.mongo.netflix.entity.Movies;
import com.hdfc.mongo.netflix.repository.IMoviesRepo;


@Service
public class MoviesService implements IMoviesService {
	
	@Autowired
	IMoviesRepo repo;

	@Override
	public Movies addMovies(Movies m) {
		// TODO Auto-generated method stub
		return repo.save(m);
	}

	@Override
	public Movies updateMovies(Movies m) {
		// TODO Auto-generated method stub
		return repo.save(m);
	}

	@Override
	public List<Movies> getAllMovies() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Movies getMoviesById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public void deleteMoviesById(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

	}

	@Override
	public List<Movies> getByname(String name) {
		// TODO Auto-generated method stub
		return repo.findByName(name);
	}
}
