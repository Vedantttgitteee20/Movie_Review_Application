package dev.vedant.movies.movies;

import dev.vedant.movies.movies.Movie;
import dev.vedant.movies.movies.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;
    public List<Movie> allMovies(){
        System.out.println("Find All Movies");
        return repository.findAll();
    }
}
