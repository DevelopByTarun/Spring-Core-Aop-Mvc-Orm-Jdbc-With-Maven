package com.spring.core.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.core.lifecycle.bean.IStudent;

public class App 
{
	public static void main( String[] args ) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	IStudent stud = (IStudent) context.getBean("studObj");
    	stud.getStudentInfo();
    	((AbstractApplicationContext) context).close();
    }
}
