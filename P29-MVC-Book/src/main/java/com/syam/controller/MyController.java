package com.syam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.syam.book.Book;

@Controller
public class MyController {

	@GetMapping("/book")
	public String method1(Model model) {
		
		Book book = new Book(1,"A",100.0);
		
		model.addAttribute("msg",book);
		
		return "book";
		
	}
}
