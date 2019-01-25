package com.spring.core.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.spring.core.di.repo.ICompany;

@ComponentScan(basePackages = "")
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ) {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	ICompany company = (ICompany) context.getBean("icomp");
    	System.out.println("Employee Details Is Given Below :->");
    	company.getEmployee();
    	System.out.println("");
    	System.out.println("Employee Details With Address Is Given Below :->");
    	company.getEmployeeWithAddress();
    }
}
