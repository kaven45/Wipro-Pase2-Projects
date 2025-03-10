package com.userservice.userservice.controller;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import com.userservice.userservice.entity.User;
import com.userservice.userservice.service.UserService;
import com.userservice.userservice.vo.ResponseTemplateVO;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;
	
	public UserController(UserService userService) {
	        this.userService = userService;
	    }
	
	@GetMapping
	public List<User> getAllUsers() {
	   // log.info("Inside getAllUsers of UserController");
	    return userService.getAllUsers();
	}

	@PostMapping
	public User saveUser(@RequestBody User user) {
		log.info("Inside saveUser of UserController");
		return userService.saveUser(user);
	}

	@GetMapping("/{id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
		log.info("Inside getUserWithDepartment of UserController");
		return userService.getUserWithDepartment(userId);
	}

}
