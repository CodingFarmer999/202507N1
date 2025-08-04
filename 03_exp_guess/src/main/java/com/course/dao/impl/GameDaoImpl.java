package com.course.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.course.dao.GameDao;
import com.course.entity.GameEntity;
import com.course.entity.GameHistoryEntity;
import com.course.service.ConnectionService;

@Repository
public class GameDaoImpl implements GameDao {

	@Autowired
	private ConnectionService connectionService;
	
	@Override
	public GameEntity newGame(GameEntity entity) {

		try (Session session = connectionService.getSession();) {
			Transaction transaction = session.beginTransaction();
			session.persist(entity);
			transaction.commit();
		}
		
		return entity;
	}

	@Override
	public GameEntity findById(Long id) {
		try (Session session = connectionService.getSession();) {
			String sql = "select g from GameEntity g where g.id = ?1";
			Query<GameEntity> query = session.createQuery(sql, GameEntity.class);
			query.setParameter(1, id);
			// 理論上一定會有資料，且只會有一筆
			return query.getSingleResult();
		}
	}

	@Override
	public void insertHistory(GameHistoryEntity entity) {
		try (Session session = connectionService.getSession();) {
			Transaction transaction = session.beginTransaction();
			session.persist(entity);
			transaction.commit();
		}
	}

	@Override
	public List<GameHistoryEntity> getHistoryByGameId(Long gameId) {
		try (Session session = connectionService.getSession();) {
			String sql = "select h from GameHistoryEntity h where h.gameId = ?1";
			Query<GameHistoryEntity> query = session.createQuery(sql, GameHistoryEntity.class);
			query.setParameter(1, gameId);
			// 理論上一定會有資料
			return query.getResultList();
		}
	}

}
