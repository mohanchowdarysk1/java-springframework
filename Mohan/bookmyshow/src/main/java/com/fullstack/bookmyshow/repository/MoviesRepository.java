package com.fullstack.bookmyshow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.bookmyshow.entity.Movie;



	@Repository
public interface MoviesRepository extends JpaRepository<Movie,Integer>{
	
		public List<Movie> findByLanguage(String language);
	}

