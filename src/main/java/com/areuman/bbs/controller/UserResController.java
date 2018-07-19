package com.areuman.bbs.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.areuman.bbs.model.User;
import com.areuman.bbs.service.UserService;

@RestController
@RequestMapping("/api")
public class UserResController {
	
	@Inject //dependancy injection
	UserService userService;
	
	@GetMapping("/test")
	public String testApi() {
		return "Welcome to REST";
	}
	
	
	@GetMapping("/getUser")
	public User getUser() {
		return userService.selectOneUser("abc");
	}

}
