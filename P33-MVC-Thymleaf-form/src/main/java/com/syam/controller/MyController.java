package com.syam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.syam.player.Player;
import com.syam.repo.PlayerRepository;
import com.syam.service.MyService;

@Controller
public class MyController {

	private MyService myService;

	@GetMapping("/player")
	public ModelAndView formLoad() {

		ModelAndView modelAndView = new ModelAndView();

		Player player = new Player();

		modelAndView.addObject("player", player);

		modelAndView.setViewName("index");
		return modelAndView;
	}

	@PostMapping("/forword")
	public ModelAndView formHandel(@ModelAttribute Player player, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView();
		
		System.out.println(player);
		myService.savePlayer(player);
		modelAndView.setViewName("success");
		modelAndView.addObject("player", player);
		return modelAndView;

	}

}
