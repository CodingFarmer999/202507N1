package com.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.course.model.TodoDto;
import com.course.service.TodoService;

@Controller
public class TodoController {

	@Autowired
	private TodoService todoService;
	
    @GetMapping("/")
    public String home(Model model) {
    	List<TodoDto> todoList = todoService.findAllTodo();
    	model.addAttribute("todoList", todoList);
        return "index";
    }
    
}
