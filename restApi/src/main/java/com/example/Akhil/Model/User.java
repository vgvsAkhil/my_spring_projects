package com.example.Akhil.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity         // ee class anadi database loo store avadaniki

@Data
public class User
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "name")
	private String name;

	
	private String email;

	
	private String password;

	
	

/*	studentId
	lastName
	firstName
	Mail
	Gender
	Country
	Course         */
	
	
}
