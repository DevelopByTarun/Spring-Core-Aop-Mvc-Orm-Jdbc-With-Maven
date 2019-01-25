package com.spring.core.autowire;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.core.autowire.bean.IBook;
import com.spring.core.autowire.bean.Config;

@ComponentScan(basePackages = "com.spring.core.autowire.bean")
public class App 
{
	@SuppressWarnings("resource")
	public static void main( String[] args ) {
    	
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	IBook book = (IBook) context.getBean("ibook");
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		System.out.println("");
    		System.out.println("1. Get Book Details");
    		System.out.println("2. Get Book Category");
    		System.out.println("3. Get Book Details With Category");
    		System.out.println("4. Exit");
    		System.out.print("Enter Your Choice :: ");
    		int choice = sc.nextInt();
    		if(choice == 1) {
    			book.showBookDetails();
    			System.out.println("");
    		}
    		else if(choice == 2) {
    			book.showBookCategory();
    			System.out.println("");
    		}
    		else if(choice == 3) {
    			book.showBookDetailsWithCategory();
    			System.out.println("");
    		}
    		else {
    			System.out.println("Good Byeee....");
    			return;
    		}
    	}
    }
}
