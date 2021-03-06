package com.spring.core.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.core.inheritance.bean.IEmployee;

public class App 
{
	@SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	IEmployee childObj = (IEmployee) context.getBean("childObject");
    	System.out.println("=====EmployeeBean Child Object====");
    	childObj.getEmployee();
    	childObj.getEmployeeWithAddress();
    }
}
