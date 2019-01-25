package com.spring.core.inheritance.bean;

public class ParentBean implements IParent {
	
	private String message;
	
	private String title;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("Message :: "+this.getMessage());
	}

	public void showTitle() {
		// TODO Auto-generated method stub
		System.out.println("Title :: "+this.getTitle());
	}	
}
