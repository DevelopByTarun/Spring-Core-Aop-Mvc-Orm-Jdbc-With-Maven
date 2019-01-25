package com.spring.core.processor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.core.processor.bean.IStudent;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	IStudent stud = (IStudent) context.getBean("studObj");
    	System.out.println("");
    	stud.getStudent();
    	System.out.println("");
    	stud.getStudentAddress();
    	System.out.println("");
    	stud.getStudentWithAddress();
    	System.out.println();
    	((AbstractApplicationContext) context).registerShutdownHook();
    }
}
