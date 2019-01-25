package com.spring.core;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.core.producer.IProducer;

public class App 
{
    @SuppressWarnings({"resource"})
	public static void main( String[] args ) {
    	
//    	create application context for calling
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    	IProducer produce = (IProducer) ac.getBean("producerObject");
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		System.out.println("");
    		System.out.println("1. Addition Of Two Number");
    		System.out.println("2. Subtraction Of Two Number");
    		System.out.println("3. Multiplication Of Two Number");
    		System.out.println("4. Division Of Two Number");
    		System.out.println("5. Square Root");
    		System.out.println("6. Cube Root");
    		System.out.println("7. Exit");
    		System.out.print("Enter Your Choice :: ");
    		int choice = sc.nextInt();
    		if(choice == 1) {
    			System.out.print("Enter First Number :: ");
    			int num1 = sc.nextInt();
    			
    			System.out.print("Enter Second Number :: ");
    			int num2 = sc.nextInt();
    			
    			int result = produce.add(num1, num2);
    			System.out.println("Addition Of Two Number Is :: "+result);
    		}
    		else if(choice == 2) {
    			System.out.print("Enter First Number :: ");
    			int num1 = sc.nextInt();
    			
    			System.out.print("Enter Second Number :: ");
    			int num2 = sc.nextInt();
    			
    			int result = produce.subtract(num1, num2);
    			System.out.println("Subtraction Of Two Number Is :: "+result);
    		}
    		else if(choice == 3) {
    			System.out.print("Enter First Number :: ");
    			int num1 = sc.nextInt();
    			
    			System.out.print("Enter Second Number :: ");
    			int num2 = sc.nextInt();
    			
    			int result = produce.multiply(num1, num2);
    			System.out.println("Multiplication Of Two Number Is :: "+result);
    		}
    		else if(choice == 4) {
    			System.out.print("Enter First Number :: ");
    			int num1 = sc.nextInt();
    			
    			System.out.print("Enter Second Number :: ");
    			int num2 = sc.nextInt();
    			
    			int result = produce.divide(num1, num2);
    			System.out.println("Division Of Two Number Is :: "+result);
    		}
    		else if(choice == 5) {
    			System.out.print("Enter Number :: ");
    			int num = sc.nextInt();
    			
    			int result = produce.squareRoot(num);
    			System.out.println("Square Root Of A Number Is :: "+result);
    		}
    		else if(choice == 6) {
    			System.out.print("Enter Number :: ");
    			int num = sc.nextInt();
    			
    			int result = produce.cubeRoot(num);
    			System.out.println("Cube Root Of A Number Is :: "+result);
    		}
    		else {
    			System.out.println("Good Byeee....");
    			return;
    		}
    	}
    }
}
