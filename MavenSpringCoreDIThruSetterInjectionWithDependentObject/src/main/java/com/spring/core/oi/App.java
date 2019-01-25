package com.spring.core.oi;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.core.oi.bean.IEmployee;

public class App 
{
	 @SuppressWarnings("resource")
		public static void main( String[] args ) {
	    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
	    	IEmployee emps = (IEmployee) ac.getBean("employeeObject");
	    	Scanner sc = new Scanner(System.in);
	    	while(true) {
	    		System.out.println("");
	    		System.out.println("1. get Employee");
	    		System.out.println("2. show Home Address");
	    		System.out.println("3. show Office Address");
	    		System.out.println("4. get Employee Home Address");
	    		System.out.println("5. get Employee Office Address");
	    		System.out.println("6. get Employee Both Address");
	    		System.out.println("7. Exit");
	    		System.out.print("Enter Your Choice :: ");
	    		int choice = sc.nextInt();
	    		if(choice == 1) {
	    			emps.getEmployee();
	    		}
	    		else if(choice == 2) {
	    			emps.showHomeAddress();
	    		}
	    		else if(choice == 3) {
	    			emps.showOfficeAddress();
	    		}
	    		else if(choice == 4) {
	    			emps.getEmployeeHomeAddress();
	    		}
	    		else if(choice == 5) {
	    			emps.getEmployeeOfficeAddress();
	    		}
	    		else if(choice == 6) {
	    			emps.getEmployeeBothAddress();
	    		}
	    		else {
	    			System.out.println("Good Byeee....");
	    			return;
	    		}
	    	}
	    }
}
