package com.fullstack.bookmyshow.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Movie")
public class Movie {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="ID")
	private Integer id;
	@Column(name="NAME")
	private String name ;
	
	@Column(name="Release Year")
	private Integer releaseyear;
	
	@Column(name="LANGUAGE")
	private String language;
	
	
	@ManyToOne
   @JoinColumn(name="Director_ID")
	private Director director;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getReleaseyear() {
		return releaseyear;
	}


	public void setReleaseyear(Integer releaseyear) {
		this.releaseyear = releaseyear;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public Director getDirector() {
		return director;
	}


	public void setDirector(Director director) {
		this.director = director;
	}
	
	



}

	