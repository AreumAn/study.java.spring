package com.areuman.bbs.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.areuman.bbs.model.User;
import com.areuman.bbs.service.UserService;

import utils.CommonConstants;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Inject
	UserService userService;
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute(CommonConstants.sessionUser);
		return "redirect:/user/login";
	}
	
	@GetMapping("/create")
	public String create() {
		return "create";
	}
	
	@GetMapping("/login")
	public String login(Model model, HttpSession session) {
		boolean isError = false;
		//System.out.println(session.getAttribute(CommonConstants.userError));
		if (session.getAttribute(CommonConstants.userError) != null)
			isError = (boolean)session.getAttribute(CommonConstants.userError);
		if (isError) {
			model.addAttribute(CommonConstants.userError, "No!");
		}
			
		return "login";
	}
	
	// @RequestMapping(value="/login", method=RequestMethod.POST)
	@PostMapping("/login")
	public String loginPost(User user, HttpSession session) {
		User loginUser = userService.selectOneUser(user.getUserID());
		if(loginUser != null && user.getUserPW().equals(loginUser.getUserPW())) {
			session.setAttribute(CommonConstants.sessionUser, user);
			return "redirect:/";
		}
		
		session.setAttribute(CommonConstants.userError, true);
		return "redirect:/user/login";
	}

}
