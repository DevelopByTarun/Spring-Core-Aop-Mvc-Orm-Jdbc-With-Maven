package com.spring.core.map;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.core.bean.IEmployee;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	IEmployee emps = (IEmployee) context.getBean("employeeObject");
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		System.out.println("");
    		System.out.println("1. Get Employee Details");
    		System.out.println("2. Show Address Name Country");
    		System.out.println("3. Show Address Map");
    		System.out.println("4. Print Complete Object");
    		System.out.println("5. Exit");
    		System.out.print("Enter Your Choice :: ");
    		int choice = sc.nextInt();
    		if(choice == 1) {
    			emps.getEmployeeDetails();
    		}
    		else if(choice == 2) {
    			emps.showAddressName();
    		}
    		else if(choice == 3) {
    			emps.showAddressMap();
    		}
    		else if(choice == 4) {
    			System.out.println(emps);
    		}
    		else {
    			System.out.println("Good Byeee....");
    			return;
    		}
    	}
    }
}
