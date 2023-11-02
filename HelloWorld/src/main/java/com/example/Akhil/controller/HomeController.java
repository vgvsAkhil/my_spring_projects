package com.example.Akhil.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController
{
	@GetMapping("/hello")
	public String helloWorld()
	{
		return "hello";
	}
}
