package com.areuman.bbs.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.areuman.bbs.model.Category;
import com.areuman.bbs.service.CategoryService;

@Controller
@RequestMapping("/topic")
public class TopicController {
	
	@Inject
	CategoryService categoryService;
	
//	@GetMapping("/write")
//	public String write(Model model) {
//		List<Category> category = categoryservice.selectCategories();
//		model.addAttribute("categorylist", category);
//		return "write";
//	}
	
	@GetMapping("/write")
	public ModelAndView write(ModelAndView mav) {
		mav.setViewName("write");;
		mav.addObject("categorylist", categoryService.selectCategories());
		return mav;
	}

}
