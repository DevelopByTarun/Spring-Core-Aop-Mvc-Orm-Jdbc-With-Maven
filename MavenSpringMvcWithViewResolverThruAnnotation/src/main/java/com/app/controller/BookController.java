package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.app.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService service;
	
	@RequestMapping(value = "/welcome")
	public ModelAndView bookName() {
		ModelAndView model = new ModelAndView();
		String result = service.largestAreaBookName();
		if(result != null) {
			model.addObject("bookName", result);
		}
		model.setViewName("success");
		return model;
	}
}
