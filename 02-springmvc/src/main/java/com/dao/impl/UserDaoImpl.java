package com.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.dao.UserDao;
import com.entity.UserEntity;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public UserEntity findByUsernameAndPassword(String username, String password) {
		// 連線取得 DB 資料
		
	    Configuration configuration = new Configuration().configure();
	    SessionFactory sessionFactory = configuration.buildSessionFactory();
	    Session session = sessionFactory.openSession();
	    
		return null;
	}

}
