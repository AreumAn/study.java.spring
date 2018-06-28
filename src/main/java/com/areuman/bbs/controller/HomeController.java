package com.areuman.bbs.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

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

import utils.CommonConstants;

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
	public String home(Model model, HttpSession session) {
//		User user = userService.selectOneUser("abc");
//		model.addAttribute("user", user);
		session.removeAttribute(CommonConstants.userError);
		
		User loginUser = (User)session.getAttribute("user");
		if (loginUser != null) {
			logger.info("******************************");
			logger.info(categoryService.selectCategories().toString());
			logger.info(topicService.selectTopics().toString());
			model.addAttribute("login", true);
			model.addAttribute("categorylist", categoryService.selectCategories());
			model.addAttribute("topiclist", topicService.selectTopics());
			return "home";
		}
		
		model.addAttribute("login", false);
		return "redirect:/user/login";
	}
	
	@RequestMapping("/asc")
	public String homeAsc(Model model) {
		model.addAttribute("categorylist", categoryService.selectCategories());
		model.addAttribute("topiclist", topicService.selectTopicsByAsc());
		return "home";
	}
	
	@RequestMapping("/desc")
	public String homeDesc(Model model) {
		model.addAttribute("categorylist", categoryService.selectCategories());
		model.addAttribute("topiclist", topicService.selectTopicsByDesc());
		return "home";
	}
	
	@RequestMapping("/date")
	public String homeDate(Model model) {
		model.addAttribute("categorylist", categoryService.selectCategories());
		model.addAttribute("topiclist", topicService.selectTopicsByDate());
		return "home";
	}
	
	@RequestMapping(value = "/aboutme", method = RequestMethod.GET)
	public void aboutme(String name, int age, Model model) {
		// http://localhost:8080/aboutme?name=areum&age=22
		model.addAttribute("name", name );
		model.addAttribute("age", age );
		
//		return "aboutme";
	}
	
}
