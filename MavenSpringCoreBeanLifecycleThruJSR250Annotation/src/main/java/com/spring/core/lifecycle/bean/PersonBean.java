package com.spring.core.lifecycle.bean;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component(value = "personBean")
public class PersonBean implements IPerson {
	
	PersonBean() {
		System.out.println("Constructor Call");
	}
	
	private String name;
	
	private String state;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void getPersonDetails() {
		// TODO Auto-generated method stub
		System.out.println("Person Name Is :: "+this.getName());
		System.out.println("Person State Is :: "+this.getState());
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("--@PostConstruct() Annotation Method Of PersonBean Is called--");
		System.out.println("");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("");
		System.out.println("--@PreDestroy() Annotation Method Of PersonBean Is called--");
	}
}
