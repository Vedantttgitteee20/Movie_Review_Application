package dev.vedant.movies.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        System.out.println("get All Movies");
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }
//    public ResponseEntity<String> getAllMovies(){
//        return new ResponseEntity<String>("All MOVIES", HttpStatus.OK);
//    }
}
