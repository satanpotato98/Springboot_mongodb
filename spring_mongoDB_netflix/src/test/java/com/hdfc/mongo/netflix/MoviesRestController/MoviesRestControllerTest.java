package com.hdfc.mongo.netflix.MoviesRestController;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hdfc.mongo.netflix.entity.Movies;

@SpringBootTest
class MoviesRestControllerTest {
	
	@Autowired
	RestTemplate rt;
	
	@Test
	void testinsertMovies() {
		
		
		Movies movie = new Movies(6, "Whiplash", 10);
		
		Movies movie1 =	rt.postForObject("http://localhost:8585/api/netflix/movies/add",movie,Movies.class);
		
		
			assertNotNull(movie1);
		
	}
	
	
	@Test
	void testGetMoviesById() {
		
		
				int id = 1;
		
				ResponseEntity<Movies>  response =	rt.getForEntity("http://localhost:8585/api/netflix/movies/get/"+id, Movies.class);
		
				Movies  movie = response.getBody();
				
				assertEquals(movie.getRating(), 8);
	}
	
	@Test
	void testGetAllMovies() {
		
		ResponseEntity<List> response= rt.getForEntity("http://localhost:8585/api/netflix/movies/getall", List.class);
		List<Movies> movies = response.getBody();
		assertNotNull(movies);
		
	}
	
	/*@Test
	void UpdateMovie() {
		
		Movies movie = new Movies(6, "Whiplash", 9);
		
		ResponseEntity<Movies> response=	rt.put("http://localhost:8585/api/netflix/movies/update", movie, Movies.class);
		
		Movies movie1=response.getBody();
		
			assertNotNull(movie1);
			rt.ent
		
	}
	
	@Test
	void DeleteById() {
		int id=-1;
		ResponseEntity<String>  response =	rt.delete("http://localhost:8585/api/netflix/movies/delete/"+id, String.class);
		
	}*/

}
