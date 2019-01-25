package com.spring.core.jsr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.core.jsr.repo.ICompany;

@ComponentScan(basePackages = "com.spring.core.jsr")
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ) {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	ICompany comp = (ICompany) context.getBean("icompany");
    	System.out.println("Employee Details Is Given Below :->");
    	comp.getEmployee();
    	System.out.println("");
    	System.out.println("Employee Details With Address Is Given Below :->");
    	comp.getEmployeeWithAddress();
    }
}
