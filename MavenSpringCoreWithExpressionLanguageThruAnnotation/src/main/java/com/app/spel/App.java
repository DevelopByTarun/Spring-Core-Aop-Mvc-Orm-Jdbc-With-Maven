package com.app.spel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.spel.bean.Customer;
import com.app.spel.bean.CustomerService;
import com.app.spel.bean.Display;
import com.app.spel.bean.ExpressionEvaluation;
import com.app.spel.bean.Show;
import com.app.spel.config.AppConfig;

public class App 
{
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ExpressionEvaluation.run();

		Show show = context.getBean(Show.class);
		System.out.println(show.getMessage());
		
		context.close();

		context = new ClassPathXmlApplicationContext("beans.xml");

		Customer newCustomer = (Customer) context.getBean("newCustomer");
		System.out.println(newCustomer);

		Customer anotherCustomer = (Customer) context.getBean("anotherCustomer");
		System.out.println(anotherCustomer);

		CustomerService service = (CustomerService) context.getBean("service");
		System.out.println(service);
		
		Display display = (Display) context.getBean("display");
		System.out.println(display);

		context.close();
	}
}
