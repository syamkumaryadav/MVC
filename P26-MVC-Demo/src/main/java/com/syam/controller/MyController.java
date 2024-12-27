package com.syam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@GetMapping("/start")
	public ModelAndView Welcome() {
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("msg","My First Spring MVC..........");
		modelAndView.setViewName("first");
		return modelAndView;
	}

}
