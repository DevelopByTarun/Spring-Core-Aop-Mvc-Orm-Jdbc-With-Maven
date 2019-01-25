package com.app.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	    ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
 
	    Customer obj = (Customer) context.getBean("customerBean");
	    System.out.println(obj);

	}
}
