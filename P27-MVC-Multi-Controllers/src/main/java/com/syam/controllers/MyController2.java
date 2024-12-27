package com.syam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController2 {
	
	@GetMapping("/wish")
	public ModelAndView Wish() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg","Good Morning Dear......");
		modelAndView.setViewName("wish");
		return modelAndView;
		
	}

}
