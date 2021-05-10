package com.zensar.task.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.task.entities.Users;
import com.zensar.task.repo.UserRepository;
@Service
public class UserServiceIMPL implements UserService{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public Users registerUser(Users user) {
		return	userRepo.save(user);
		 
	}

	@Override
	public boolean authenticateUser(String username,String password) {
		
		if(username.equals(username)&&password.equals(password))
		{
			
			return true;
		}
		return false;
	}

}
