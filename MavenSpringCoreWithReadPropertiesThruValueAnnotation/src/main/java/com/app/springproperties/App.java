package com.app.springproperties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.app.springproperties.config.AppConfig;
import com.app.springproperties.service.IService;

public class App 
{
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		IService service = (IService) context.getBean("service");
		System.out.println(service.getValue());
		
		context.close();
	}
}
