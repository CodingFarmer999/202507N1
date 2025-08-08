package com.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.dao.TodoDao;
import com.course.model.TodoDto;

@Service
public class TodoService {
	
	@Autowired
	private TodoDao todoDao;
	
	public List<TodoDto> findAllTodo() {
		List<TodoDto> dtoList = todoDao.findAll();
		for (TodoDto dto : dtoList) {
			System.out.println(dto);
		}
		return dtoList;
	}
}
