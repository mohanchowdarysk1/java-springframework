package com.fullstack.bookmyshow.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.bookmyshow.entity.Movie;
import com.fullstack.bookmyshow.service.MovieService;

@RestController
@RequestMapping("/movies")
public class Movieapi {
    private MovieService movieService;

    public Movieapi(MovieService movieService) {
        System.out.println("creating"+this.getClass().getName());
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> get(){
        return this.movieService.get();
    }
    @GetMapping("/{language}")
    public List<Movie> get(@PathVariable String language){
        return this.movieService.get(language);
    }

    @PostMapping
    public Integer save(@RequestBody Movie movie){
        return this.movieService.add(movie).getId();
    }

    @DeleteMapping
    public Boolean save(@RequestParam Integer id){
        return this.movieService.delete(id);
    }

}
