package com.spring.core.autowire.bean;

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
