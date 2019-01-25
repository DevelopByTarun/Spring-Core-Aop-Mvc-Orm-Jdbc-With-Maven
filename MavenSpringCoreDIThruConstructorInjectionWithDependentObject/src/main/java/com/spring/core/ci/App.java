package com.spring.core.ci;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.core.ci.bean.IEmployee;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    	IEmployee emp = (IEmployee) ac.getBean("employeeObject");
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		System.out.println("");
    		System.out.println("1. get Employees");
    		System.out.println("2. get Address");
    		System.out.println("3. get Employee With Address");
    		System.out.println("4. Exit");
    		System.out.print("Enter Your Choice :: ");
    		int choice = sc.nextInt();
    		if(choice == 1) {
    			emp.getEmployees();
    		}
    		else if(choice == 2) {
    			emp.getAddress();
    		}
    		else if(choice == 3) {
    			emp.getEmployeesWithAddress();
    		}
    		else {
    			System.out.println("Good Byeee....");
    			return;
    		}
    	}

    }
}
