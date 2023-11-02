package com.example.akhil.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data                 
@AllArgsConstructor    
@NoArgsConstructor
@Builder
public class User {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long studentId;
	private String firstName;
	private String lastName;
	private String Mail;
	private String Password;
	private String Gender;
	private String Country;
	private String Course;
	


}
