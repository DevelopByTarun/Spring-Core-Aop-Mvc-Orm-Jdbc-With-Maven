package com.examples;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLConfigExample {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-aop-beans.xml");
		App app = context.getBean(App.class);
        app.printHelloWorld();
        context.close();
	}
}
