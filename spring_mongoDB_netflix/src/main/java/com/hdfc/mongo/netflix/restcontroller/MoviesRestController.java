package com.hdfc.mongo.netflix.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.mongo.netflix.entity.Movies;
import com.hdfc.mongo.netflix.service.IMoviesService;

@RestController
@RequestMapping("/api/netflix/movies")
public class MoviesRestController {

	@Autowired
	IMoviesService service;
	
	@PostMapping("/add")
	public   Movies  insertMovies(@RequestBody Movies m) {
		
			return	service.addMovies(m);
		
		
	}
	
	@PutMapping("/update")
	public  Movies   updateMovies(@RequestBody Movies Movies) {
		
		
		  return service.updateMovies(Movies);
		
		
	}
	
	
	@GetMapping("/getall")
	public      List<Movies>       getAllMoviess(){
		
		
		return  service.getAllMovies();
		
		
	}
	
	
	
	@GetMapping("/get/{id}")
	public  Movies   getMoviesById (@PathVariable int id) {
		
		
		return service.getMoviesById(id);
		
	}
	
	
	@DeleteMapping("/delete/{id}")
	public  ResponseEntity<String>    deleteMoviesById(@PathVariable  int id) {
		
		
			service.deleteMoviesById(id);
			
			return  new ResponseEntity<String>("Record Deleted ",HttpStatus.GONE);
		
		
	}
	
	@GetMapping("/getbyname/{name}")
	public List<Movies>  getByname(@PathVariable  String name){
		
		return  service.getByname(name);
		
	}
	
}
