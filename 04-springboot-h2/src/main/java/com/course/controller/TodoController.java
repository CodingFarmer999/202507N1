package com.course.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class TodoController {

	@GetMapping("/add")
	public String addTodo() {
		todoService.addTodo();
		return "index";
	}
}
