package com.demo.withoutxml;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.demo.withoutxml.bean.Config;
import com.demo.withoutxml.bean.HelperBean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.demo.withoutxml.bean")
public class App 
{
	@SuppressWarnings("resource")
	public static void main( String[] args ) {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	HelperBean hb = (HelperBean) context.getBean("helperBean");
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		System.out.println("");
    		System.out.println("1. Show Employee");
    		System.out.println("2. Show Employee Address");
    		System.out.println("3. Show Employee With Address");
    		System.out.println("4. Exit");
    		System.out.print("Enter Your Choice :: ");
    		int choice = sc.nextInt();
    		if(choice == 1) {
    			hb.showEmployee();
    		}
    		else if(choice == 2) {
    			hb.showEmployeeAddress();
    		}
    		else if(choice == 3) {
    			hb.showEmployeeWithAddress();
    		}
    		else {
    			System.out.println("Good Byee....");
    			return;
    		}
    	}
    }
}
