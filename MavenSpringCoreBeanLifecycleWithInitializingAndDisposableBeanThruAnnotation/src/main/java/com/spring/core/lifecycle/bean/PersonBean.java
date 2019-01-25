package com.spring.core.lifecycle.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.DisposableBean;

@Component(value = "personBean")
public class PersonBean implements IPerson, InitializingBean, DisposableBean {
	
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
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("--afterPropertiesSet() Method Of PersonBean Is called--");
		System.out.println("");
	}
	
	public void destroy() throws Exception {
		System.out.println("");
		System.out.println("--destroy() Method Of PersonBean Is called--");
	}
}
