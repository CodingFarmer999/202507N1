package com.course.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.course.dao.TodoDao;
import com.course.model.TodoDto;

public class TodoService {

	public void addTodo() {
		TodoDto dto = new TodoDto();
		dto.setTitle("吃飯2");
		dto.setDueDate(new Date());
		dto.setStatus(0);
		todoDao.add(dto);
	}
}
