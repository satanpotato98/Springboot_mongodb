package com.hdfc.mongo.netflix.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.mongo.netflix.entity.Movies;

@Repository
public interface IMoviesRepo extends MongoRepository<Movies, Integer>{

	public  List<Movies>   findByName(String name);
}
