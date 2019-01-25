package com.spring.core.autowire.qualifier;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.spring.core.autowire.qualifier.bean.Config;
import com.spring.core.autowire.qualifier.bean.IEmployee;

@ComponentScan(basePackages = "com.spring.core.autowire.qualifier.bean")
public class App 
{
	@SuppressWarnings("resource")
	public static void main( String[] args ) {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	IEmployee employee = (IEmployee) context.getBean("iemp");
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		System.out.println("");
    		System.out.println("1. Get Employee");
    		System.out.println("2. Get Employee Home Address");
    		System.out.println("3. Get Employee Office Address");
    		System.out.println("4. Get Employee With Both Address");
    		System.out.println("5. Exit");
    		System.out.print("Enter Your Choice :: ");
    		int choice = sc.nextInt();
    		if(choice == 1) {
    			employee.displayEmployee();
    		}
    		else if(choice == 2) {
    			employee.displayEmployeeHomeAddress();
    		}
    		else if(choice == 3) {
    			employee.displayEmployeeOfficeAddress();
    		}
    		else if(choice == 4) {
    			employee.displayEmployeeWithBothAddress();
    		}
    		else {
    			System.out.println("Good Byeee....");
    			return;
    		}
    	}
    }
}
