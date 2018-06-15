package com.areuman.bbs.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.areuman.bbs.model.User;
import com.areuman.bbs.service.CategoryService;
import com.areuman.bbs.service.TopicService;
import com.areuman.bbs.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
//	UserService userService;
	CategoryService categoryService;
	@Inject
	TopicService topicService;
	
	@RequestMapping("/")
	public String home(Model model) {
//		User user = userService.selectOneUser("abc");
//		model.addAttribute("user", user);
		logger.info("******************************");
		logger.info(categoryService.selectCategories().toString());
		logger.info(topicService.selectTopics().toString());
		model.addAttribute("categorylist", categoryService.selectCategories());
		model.addAttribute("topiclist", topicService.selectTopics());
		
		return "home";
	}
	
	@RequestMapping(value = "/aboutme", method = RequestMethod.GET)
	public String aboutme(String name, int age, Model model) {
		// http://localhost:8080/aboutme?name=areum&age=22
		model.addAttribute("name", name );
		model.addAttribute("age", age );
		
		return "aboutme";
	}
	
}
