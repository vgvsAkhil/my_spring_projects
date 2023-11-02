package com.example.Akhil.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Akhil.Model.User;
import com.example.Akhil.Service.UserService;





@RestController
public class UserController 
{
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/add")//10rs
	public User addUser(@RequestBody User user)// nuvu 
	{
		return userService.addUser(user);// surya 
	}
          	
   
}
   
