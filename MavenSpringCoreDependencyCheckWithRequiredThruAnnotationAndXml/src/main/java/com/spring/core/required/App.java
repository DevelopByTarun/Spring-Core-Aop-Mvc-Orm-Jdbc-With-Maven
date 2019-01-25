package com.spring.core.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.core.required.bean.ICustomer;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	ICustomer cust = (ICustomer) context.getBean("custObj");
    	cust.getCustomerDetails();
    }
}

//if you want to remove the error then goto spring.xml file and 
//uncomment the setter of CITY, because all setters is required