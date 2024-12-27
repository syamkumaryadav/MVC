package com.syam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.syam.form.MyForm;

@Controller
public class MyFormController {
	
	@GetMapping("/")
	public String formInput(Model model) {
		
		MyForm myForm = new MyForm();
		
		model.addAttribute("reference",myForm);
		
		return "index";
		
	}
	
	@PostMapping("/mapping")
	public String formHandler(MyForm myForm, Model model) {
		System.out.println(myForm);		//--------->>>> for console printing
		
		String text="Successfull............";
		
		model.addAttribute("msg",text);
		
		return "success";
		
	}

}
