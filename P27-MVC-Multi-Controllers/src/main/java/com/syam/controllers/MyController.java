package com.syam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@GetMapping("/welcome")
	public ModelAndView welcome() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg","Welcome Dear.....");
		modelAndView.setViewName("welocome");
		return modelAndView;
		
	}
	
	@GetMapping("/next")
	public ModelAndView nextPage() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("text","now u r navigate to another page dear......");
		modelAndView.setViewName("page2");
		return modelAndView;
		
	}

}
