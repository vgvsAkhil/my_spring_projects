package com.example.Akhil.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Akhil.Model.User;
import com.example.Akhil.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService
{
	
     @Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user) 
	{
		return userRepository.save(user);
	}
	
     

}
