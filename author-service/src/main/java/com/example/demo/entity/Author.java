package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name="authors")
public class Author {

	@Id
@Column(name="phoneNumber")
	private long phoneNumber;
	private String firstName;
	private String lastName;
	private String address;
	
}
