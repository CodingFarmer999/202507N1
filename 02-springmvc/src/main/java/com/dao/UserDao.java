package com.dao;

import com.entity.UserEntity;

public interface UserDao {

	// Read
	public UserEntity findByUsernameAndPassword(String username, String password);
	
	// Create
	public void addUser(UserEntity userEnity);
	
	// Update
	
	// Delete
}
