package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public boolean checkLogin(String username, String password) {
		// 呼叫 Dao/Repository
		return true;
	}
	
}
