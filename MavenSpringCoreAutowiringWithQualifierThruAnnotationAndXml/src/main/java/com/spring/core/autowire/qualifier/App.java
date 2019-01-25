package com.spring.core.autowire.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.core.autowire.qualifier.bean.ICoordinates;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	ICoordinates coords = (ICoordinates) context.getBean("triangleObject");
    	coords.drawTriangle();
    }
}
