package com.spring.core.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.core.ci.bean.IEmployee;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	IEmployee emp = (IEmployee) context.getBean("empObject");
    	emp.getEmployees();
    }
}
