package com.spring.core.innerb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.core.bean.IEmployee;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        IEmployee emps = (IEmployee) context.getBean("empObj");
        emps.getEmployee();
        System.out.println("");
        emps.showHomeAddress();
        System.out.println("");
        emps.getEmployeeHomeAddress();
    }
}
