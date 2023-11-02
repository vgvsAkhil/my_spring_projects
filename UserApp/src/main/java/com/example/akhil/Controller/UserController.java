package com.example.akhil.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.akhil.Model.User;
import com.example.akhil.service.UserService;


@RestController
public class UserController 
{

	@Autowired
	private UserService userService;
	
	
	@PostMapping("/add")
	public User addNewUser(@RequestBody User user )
	{
		return userService.AddUser(user);
		
	}
	
}
