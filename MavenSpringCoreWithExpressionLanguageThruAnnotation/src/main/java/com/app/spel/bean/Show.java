package com.app.spel.bean;

public class Show {
	private String message;

	public Show() {

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void addMessage(String message){
		this.message += "\n" + message;
	}

}
