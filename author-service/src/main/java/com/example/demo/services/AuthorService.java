package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Author;

import com.example.demo.repos.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository repo;
	
	public List<Author> getAll(){
		
		
		return this.repo.findAll();
	}
	
	public Author add(Author entity) {
		
		return this.repo.save(entity);
	}
	
	public List<Author> getByFirstName(String firstname){
        return this.repo.findByFirstName(firstname);
    }
	
	
}
