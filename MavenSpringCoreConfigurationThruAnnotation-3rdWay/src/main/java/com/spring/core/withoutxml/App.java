package com.spring.core.withoutxml;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.core.withoutxml.bean.CalculatorBean;
import com.spring.core.withoutxml.bean.Config;
import com.spring.core.withoutxml.bean.ICalculator;

public class App 
{
	@SuppressWarnings("resource")
	public static void main( String[] args ) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		ICalculator  calc = (ICalculator) context.getBean(CalculatorBean.class);
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("");
			System.out.println("1. For Sum Operation");
			System.out.println("2. For Subtract Operation");
			System.out.println("3. For Multiply Operation");
			System.out.println("4. For Divide Operation");
			System.out.println("5. For Square Root Operation");
			System.out.println("6. For Cube Root Operation");
			System.out.println("7. Summary For This Programe");
			System.out.println("8. Exit");
			System.out.println("");
			System.out.print("Enter Your Choice :: ");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.print("Enter Value Of X :: ");
				int x = sc.nextInt();
				
				System.out.print("Enter Value Of Y :: ");
				int y = sc.nextInt();
				
				System.out.print("The Result Of X And Y Addition Is :: "+calc.add(x, y));
				System.out.println("");
			}
			else if(choice == 2) {
				System.out.print("Enter Value Of X :: ");
				int x = sc.nextInt();
				
				System.out.print("Enter Value Of Y :: ");
				int y = sc.nextInt();
				
				System.out.println("The Result Of X And Y Subtraction Is :: "+calc.subtract(x, y));
				System.out.println("");
			}
			else if(choice == 3) {
				System.out.print("Enter Value Of X :: ");
				int x = sc.nextInt();
				
				System.out.print("Enter Value Of Y :: ");
				int y = sc.nextInt();
				
				System.out.println("The Result Of X And Y Multiplication Is :: "+calc.multiply(x, y));
				System.out.println("");
			}
			else if(choice == 4) {
				System.out.print("Enter Value Of X :: ");
				int x = sc.nextInt();
				
				System.out.print("Enter Value Of Y :: ");
				int y = sc.nextInt();
				
				System.out.println("The Result Of X And Y Division Is :: "+calc.divide(x, y));
				System.out.println("");
			}
			else if(choice == 5) {
				System.out.print("Enter Value Of X :: ");
				int x = sc.nextInt();
				
				System.out.println("The Result Of X Square Root Is :: "+calc.square(x));
				System.out.println("");
			}
			else if(choice == 6) {
				System.out.print("Enter Value Of X :: ");
				int x = sc.nextInt();
				
				System.out.println("The Result Of X Cube Root Is :: "+calc.cube(x));
				System.out.println("");
			}
			else if(choice == 7) {
				calc.summary();
				System.out.println("");
			}
			else {
				System.out.println("Good Byee.....");
				return;
			}
		}
    }
}
