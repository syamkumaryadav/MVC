package com.syam.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {
	
	@GetMapping("/")
	public ModelAndView Approach1() {
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("msg","1st Approach.........");
		
		modelAndView.setViewName("Approach1");
		
		return modelAndView;
	}
	
	
	
	@GetMapping("/Approach2")
	public String Approach2(Model model) {
		
		String text="2nd Approach.........";
		
		model.addAttribute("msg",text);
		
		return "Approach2";
		
	}
	
	
	//++++++++++++++++++++++++++	ResponseBody	+++++++++++++++++++++++++
	@GetMapping("/Approach3")
	@ResponseBody		//-------->>>>>> directly showing text without using view concept 
	public String Approach3() {
		
		String text="3rd Approach...........";
		
		return text;
	}
	
	
	
	@RequestMapping("/Approach4")
	public String Approach4() {
		return "Approach4";
	}
	
	
	
	
	
	@GetMapping("/er")
	public ResponseEntity<String> er(){
		return new ResponseEntity<String>("hello world",HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/er1")
	public String  er1(Model andView){
		
		return "Approach2";
	}
	
	
}
