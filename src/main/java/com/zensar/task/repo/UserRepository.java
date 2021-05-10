package com.zensar.task.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zensar.task.entities.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{

	@Query("from Users where username=:username and password=:password")
    public boolean authenticateUser(String username, String password);
	
	
}
