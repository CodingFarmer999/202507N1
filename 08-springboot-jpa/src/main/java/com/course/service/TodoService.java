package com.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.entity.TodoEntity;
import com.course.repository.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository todoRepository;
	
	/**
	 * 取得所有待辦事項
	 * @return
	 */
	public List<TodoEntity> getAllTodo() {
		return todoRepository.findAll();
	}

	public TodoEntity addTodo(TodoEntity entity) {
		return todoRepository.save(entity);
	}
	
	public void deleteTodo(Long id) {
		todoRepository.deleteById(id);
	}
	
	public TodoEntity updateTodo(TodoEntity entity) {
		Long id = entity.getId();
		Optional<TodoEntity> todoOp = todoRepository.findById(id);
		
		if (todoOp.isPresent()) {
			// 有東西
			TodoEntity todo = todoOp.get();
			todo.setTitle(entity.getTitle());
			// 其他欄位的話，繼續更新
			todo.setMemo(entity.getMemo());
			
			return todoRepository.save(todo);
		}
		
//		TodoEntity todoEntity2 = todoRepository.findById(id).orElse(null);
//		return todoRepository.save(todoEntity2);
		
		return null;
	}
	
	public void deleteAllTodo() {

		// 一筆一筆刪
		todoRepository.deleteAll();
		// 一次刪全部
		todoRepository.deleteAllInBatch();
	}
}
