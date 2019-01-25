package com.spring.core.autowire.qualifier.bean;

import org.springframework.stereotype.Component;

@Component(value = "consumer")
public class ConsumerBean implements Main {
		
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println("Consumer Bean Is Calling");
	}
}
