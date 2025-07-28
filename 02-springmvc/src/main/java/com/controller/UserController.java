package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// @Component
@Controller
public class UserController {

	@RequestMapping("/login")
	public String login() {
		// "/WEB-INF/views/login.jsp" 
		
		if (false) {
			return "loginSuccess";
		} else {
			return "loginFail";
		}
		
	}
}
