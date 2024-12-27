package com.syam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String method(Model model) {
		
		String text="this is my first tymeleaf..........";
		
		model.addAttribute("msg",text);
		
		return "welcome";
	}
}
