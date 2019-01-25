package com.app.bean;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	public Integer id;
	
	public String name;
	
	public User(Integer id, String name){
		this.id = id;
		this.name = name;
	}
}
