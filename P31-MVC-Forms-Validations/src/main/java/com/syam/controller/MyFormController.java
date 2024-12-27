package com.syam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.syam.binding.MyForm;

import jakarta.validation.Valid;



@Controller
public class MyFormController {
	
	@GetMapping("/")
	public String formInput(Model model) {
		
		MyForm myForm = new MyForm();
		
		model.addAttribute("myForm",myForm);
		
		return "index";
		
	}
	
	@PostMapping("/mapping")
	public String formHandler(Model model, @Valid MyForm myForm, BindingResult result) {
		if(result.hasErrors()) {
			return "index";
		}
		
		//logic to store form data in db 
		
		System.out.println(myForm);		//--------->>>> for console printing
		
		String text="Successfull............";
		
		model.addAttribute("msg",text);
		
		return "success";
		
	}

}
