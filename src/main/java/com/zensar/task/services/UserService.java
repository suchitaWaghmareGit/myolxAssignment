package com.zensar.task.services;



import com.zensar.task.entities.Users;


public interface UserService {

	

	public Users registerUser(Users user);

	public boolean authenticateUser(String username,String password);

}
