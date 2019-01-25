package com.spring.core.autowire.bean;

import org.springframework.stereotype.Component;

@Component(value = "categoryBean")
public class CategoryBean {
	
	private String bookCategory;

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	
	public void bookCategory() {
		System.out.println("Book Category Is :: "+this.getBookCategory());
	}
}
