package com.course.dao;

import java.util.List;

import com.course.entity.GameEntity;
import com.course.entity.GameHistoryEntity;

public interface GameDao {

	public GameEntity newGame(GameEntity entity);
	
	public GameEntity findById(Long id);
	
	public void insertHistory(GameHistoryEntity entity);
	
	public List<GameHistoryEntity> getHistoryByGameId(Long gameId);
	
}
