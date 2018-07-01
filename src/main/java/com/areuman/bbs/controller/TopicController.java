package com.areuman.bbs.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.areuman.bbs.model.Topic;
import com.areuman.bbs.model.User;
import com.areuman.bbs.service.CategoryService;
import com.areuman.bbs.service.TopicService;
import com.areuman.bbs.service.UserService;

import utils.CommonConstants;

@Controller
@RequestMapping("/topic")
public class TopicController {

	private static final Logger logger = LoggerFactory.getLogger(TopicController.class);
	
	@Inject
	CategoryService categoryService;
	@Inject
	UserService userService;
	@Inject
	TopicService topicService;
	
	
//	@GetMapping("/write")
//	public String write(Model model) {
//		List<Category> category = categoryservice.selectCategories();
//		model.addAttribute("categorylist", category);
//		return "write";
//	}
	
	@GetMapping("/write")
	public ModelAndView write(ModelAndView mav) {
		mav.setViewName("write");
		mav.addObject("categorylist", categoryService.selectCategories());
		return mav;
	}
	
	@PostMapping("/write")
	public String write(Topic topic, HttpSession session) {
		String writer = (String) session.getAttribute("userID");
		logger.info(writer);
		topic.setWriter(writer);
		topicService.insertTopic(topic);
		return "redirect:/";
	}

}
