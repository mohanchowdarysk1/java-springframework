package com.fullstack.bookmyshow.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fullstack.bookmyshow.entity.Movie;
import com.fullstack.bookmyshow.repository.MoviesRepository;

@Service
public class MovieService {
    MoviesRepository moviesRepository;

    public MovieService(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

public List<Movie> get(){
    return this.moviesRepository.findAll();
}
public List<Movie> get(String language){
    return this.moviesRepository.findByLanguage(language);
}
public Movie add(Movie movie){
    return this.moviesRepository.save(movie);
}

public Boolean delete(Integer id){
    this.moviesRepository.deleteById(id);
    return true;   
}


}
