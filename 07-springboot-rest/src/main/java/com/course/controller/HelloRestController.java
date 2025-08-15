package com.course.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	// GetMapping
	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
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
	
	@PutMapping("/json/user")
	public User updateUserJson(@RequestBody User user) {
		user.setUsername(user.getUsername() + "!!!!!");
		return user;
	}
	
	@PatchMapping("/json/user")
	public User updatePatchUserJson(@RequestBody User user) {
		user.setUsername(user.getUsername() + "!!!!!");
		return user;
	}
	
	@DeleteMapping("/json/user/{username}")
	public void updatePatchUserJson(@PathVariable String  username) {
		System.out.println("@DeleteMapping: " + username);
		// 刪除

	}
}
