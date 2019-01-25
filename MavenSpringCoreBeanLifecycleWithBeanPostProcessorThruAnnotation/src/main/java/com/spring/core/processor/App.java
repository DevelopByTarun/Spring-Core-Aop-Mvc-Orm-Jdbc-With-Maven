package com.spring.core.processor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import com.spring.core.processor.bean.AppConfig;
import com.spring.core.processor.bean.IStudent;

@ComponentScan(basePackages = "com.spring.core.processor.bean")
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ) {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	IStudent stud = (IStudent) context.getBean("istudent");
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
