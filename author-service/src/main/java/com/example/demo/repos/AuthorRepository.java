package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Author;



public interface AuthorRepository  extends JpaRepository<Author, Integer>{

	
	public List<Author> findByFirstName(String qryString);
}
