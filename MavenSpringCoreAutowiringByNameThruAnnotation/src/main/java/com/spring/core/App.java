package com.spring.core;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.core.autowire.bean.Config;
import com.spring.core.autowire.bean.IEmployee;

@ComponentScan(basePackages = "com.spring.core.autowire.bean")
public class App 
{
	@SuppressWarnings("resource")
	public static void main( String[] args ) {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	IEmployee methods = (IEmployee) context.getBean("iemployee");
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		System.out.println("");
    		System.out.println("1. Get Employee Details");
    		System.out.println("2. Get Employee With Company Details");
    		System.out.println("3. Exit");
    		System.out.print("Enter Your Choice :: ");
    		int choice = sc.nextInt();
    		if(choice == 1) {
    			methods.getEmployee();
    		}
    		else if(choice == 2) {
    			methods.getEmployeeWithCompanyDetails();
    		}
    		else {
    			System.out.println("Good Byeee....");
    			return;
    		}
    	}
    }
}
