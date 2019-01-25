package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.demo.bean.HelperBean;
//import com.demo.bean.IEmployee;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	// first way
//    	IEmployee emp1 = (IEmployee) context.getBean("employeeObj");
//    	emp1.getEmployee();
//    	System.out.println("");
//    	emp1.showHomeAddress();
//    	System.out.println("");
//    	emp1.showOfficeAddress();
    	
    	// second way
    	HelperBean emp2 = (HelperBean) context.getBean("helper");
    	emp2.getEmployee();
    	System.out.println("");
    	emp2.showHomeAddress();
    	System.out.println("");
    	emp2.showOfficeAddress();
    }
}
