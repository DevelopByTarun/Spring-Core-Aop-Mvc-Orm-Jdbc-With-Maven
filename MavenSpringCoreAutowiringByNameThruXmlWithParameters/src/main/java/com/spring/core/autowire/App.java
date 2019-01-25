package com.spring.core.autowire;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.core.autowire.bean.IEmployee;

public class App 
{
	@SuppressWarnings("resource")
	public static void main( String[] args ) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	IEmployee methods = (IEmployee) context.getBean("employeeObject");
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
