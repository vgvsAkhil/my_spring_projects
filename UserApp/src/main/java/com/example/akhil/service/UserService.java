package com.example.akhil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.akhi.Repository.UserRepository;
import com.example.akhil.Model.User;

@Service
public class UserService 
{
   @Autowired
	private UserRepository userRepository;
	
	public User AddUser(User user) {
		return userRepository.save(user);
	}

}
