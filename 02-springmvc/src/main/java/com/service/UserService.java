package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.entity.UserEntity;
import com.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public boolean checkLogin(String username, String password) {
		// 呼叫 Dao/Repository
		
		UserEntity user = userDao.findByUsernameAndPassword(username, password);
		if (user != null) {
			return true;
		} else {
			return false;
		}
		// return user != null;
	}
	
	public void addUser(String username, String password) {
		UserEntity entity = new UserEntity();
		entity.setUsername(username);
		entity.setPassword(password);
		
		userDao.addUser(entity);
		
	}
	
	public List<UserEntity> findAllUser() {
		List<UserEntity> userList = userDao.findAll();
		
		// 如果有需要轉換物件，在這裡做
		
		
		return userList;
	}
	
	
	public void deleteUserById(Long id) {
		// 透過ID 找到 UserEntity
		UserEntity entity = userDao.findById(id);
		
		userDao.delUser(entity);
		
	}
	
	public UserVo findUserById(Long id) {
		// 透過ID 找到 UserEntity
		UserEntity entity = userDao.findById(id);

		UserVo vo = new UserVo();
		vo.setUsername(entity.getUsername());
		vo.setPassword(entity.getPassword());
		vo.setEmail(entity.getEmail());
		vo.setBirthDay(entity.getBirthDay());
		
		return vo;
	}
	
}
