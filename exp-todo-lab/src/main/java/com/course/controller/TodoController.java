package com.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.course.model.TodoVo;
import com.course.service.TodoService;

@Controller
public class TodoController {

	@Autowired
	private TodoService todoService;
	
    @GetMapping("/")
    public String home(Model model) {
    	List<TodoVo> todoList = todoService.findAllTodo();
    	model.addAttribute("todoList", todoList);
        return "index";
    }
    
    @ModelAttribute("title")
    public String title() {
    	return "待辦事項222";
//    	return "<script>alert('!!!!!!')</script>";
    }
    
    @GetMapping("/toAddPage")
    public String toAddPage() {
    	return "addTodoPage";
    }
    
    @PostMapping("/todo")
    public String addTodo() {
    	return "index";
    }
    
}
