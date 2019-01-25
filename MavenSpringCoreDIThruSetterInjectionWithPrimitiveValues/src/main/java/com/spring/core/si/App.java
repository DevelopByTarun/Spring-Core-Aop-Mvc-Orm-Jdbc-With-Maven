package com.spring.core.si;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.core.si.bean.IEmployee;

public class App 
{
	@SuppressWarnings("resource")
	public static void main( String[] args ) {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    	IEmployee emp = (IEmployee) ac.getBean("employeeObject");
    	emp.showRecord();
    }
}
