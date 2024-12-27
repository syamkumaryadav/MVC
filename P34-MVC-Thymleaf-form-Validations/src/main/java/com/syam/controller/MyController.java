package com.syam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.syam.binding.Animal;

import jakarta.validation.Valid;

@Controller
public class MyController {
	
	@GetMapping("/animal")
	public String animalForm(Model model) {
		
		Animal animal = new Animal();
		
		model.addAttribute("animal",animal);
		
		return "home";
	}
	
	
	@PostMapping("/done")
	public String animalFormHandel(@Valid Animal animal,BindingResult result,Model model) {
		
		if(result.hasErrors()) {
			return "home";
		}		
		System.out.println(animal);
		model.addAttribute("successss",animal.getName()+" successfully uploaded.......");
		
		return "success";
	}

}
