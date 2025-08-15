package com.course.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.course.model.User;

//@Controller
@RestController
//@RequestMapping(value = "/kitty")
public class HelloRestController {

	@GetMapping("/hello")
//	@ResponseBody
	public String hello() {
		return "hello kitty";
	}
	
	@GetMapping("/hello2")
//	@ResponseBody
	public String hello2() {
		return "hello2";
	}
	
	@GetMapping("/users")
	public List<User> getUsers() {
		User user1 = new User("Kitty", "1234");
		User user2 = new User("Snoopy", "1234");
		return Arrays.asList(user1, user2);
	}
	
	@PostMapping("/user")
	public User addUser(User user) {
		user.setUsername(user.getUsername() + "!!!!!");
		return user;
	}
	
	@PostMapping("/json/user")
	public User addUserJson(@RequestBody User user) {
		user.setUsername(user.getUsername() + "!!!!!");
		return user;
	}
}
