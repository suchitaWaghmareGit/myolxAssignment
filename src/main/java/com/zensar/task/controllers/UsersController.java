package com.zensar.task.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.task.entities.Users;
import com.zensar.task.services.UserService;

@RestController
public class UsersController {

	@Autowired
	UserService userService;
	
	@GetMapping("/authenticate/{username}/{password}")
	public boolean authenticateUser(@PathVariable("username") String username,@PathVariable("password") String password)
	{
	return	userService.authenticateUser(username,password);
	}
	
	@PostMapping("/register")
	public Users registerUser(@RequestBody Users user)
	{
		return userService.registerUser(user);
	}
	
	
	
}
