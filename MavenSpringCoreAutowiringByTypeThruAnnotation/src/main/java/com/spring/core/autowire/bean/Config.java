package com.spring.core.autowire.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean(name = "category")
	CategoryBean getCategoryBean() {
		CategoryBean cb = new CategoryBean();
		cb.setBookCategory("Information Technology");
		return cb;
	}
	
	@Bean(name = "ibook")
	IBook getIBook() {
		BookBean bb = new BookBean();
		bb.setBookName("Software Development Lifecycle");
		bb.setBookPrice(2000);
		return bb;
	}
}
