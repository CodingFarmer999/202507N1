package com.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
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
	    
	    // JPQL
	    // SQL Injection -> preparestatement
	    String sql = "select u from UserEntity u where u.username = ?1 and u.password = ?2";
	    Query<UserEntity> query = session.createQuery(sql, UserEntity.class);
	    query.setParameter(1, username);
	    query.setParameter(2, password);
	    List<UserEntity> userList = query.getResultList();
		return userList.get(0) ;
	}

}
