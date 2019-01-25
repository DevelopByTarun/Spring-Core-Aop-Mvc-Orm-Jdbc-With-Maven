package com.spring.core.autowire.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "bookBean")
public class BookBean implements IBook {
	
	private CategoryBean categoryBean;
	
	private String bookName;
	
	private int bookPrice;

	public CategoryBean getCategoryBean() {
		return categoryBean;
	}
	
	@Autowired
	public void setCategoryBean(CategoryBean categoryBean) {
		this.categoryBean = categoryBean;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public void showBookDetails() {
		// TODO Auto-generated method stub
		System.out.println("Book Name Is :: "+this.getBookName());
		System.out.println("Book Price Is :: "+this.getBookPrice());
	}

	public void showBookCategory() {
		// TODO Auto-generated method stub
		this.categoryBean.bookCategory();
	}

	public void showBookDetailsWithCategory() {
		// TODO Auto-generated method stub
		this.showBookDetails();
		this.showBookCategory();
	}
}
