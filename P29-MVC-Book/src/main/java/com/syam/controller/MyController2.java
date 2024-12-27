package com.syam.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.syam.book.Book;

@Controller
public class MyController2 {
	
	@GetMapping("/books")
	public String method2(Model model) {
		Book sumaakka = new Book(1,"A",100.0);
		Book b2 = new Book(1,"A",100.0);
		Book b3 = new Book(1,"A",100.0);
		Book b4 = new Book(1,"A",100.0);
		Book b5 = new Book(1,"A",100.0);
		
		List<Book> asList = Arrays.asList(sumaakka,b2,b3,b4,b5);
		
		model.addAttribute("books",asList);
		
		return "books";
		
	}
	

}
