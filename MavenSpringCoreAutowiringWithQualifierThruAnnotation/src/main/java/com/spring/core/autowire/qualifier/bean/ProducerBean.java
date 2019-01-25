package com.spring.core.autowire.qualifier.bean;

import org.springframework.stereotype.Component;

@Component(value = "producer")
public class ProducerBean implements Main {
	
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println("Producer Bean Is Calling");
	}
}
