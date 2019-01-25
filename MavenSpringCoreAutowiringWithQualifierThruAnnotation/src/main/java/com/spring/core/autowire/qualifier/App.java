package com.spring.core.autowire.qualifier;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.core.autowire.qualifier.bean.Config;
import com.spring.core.autowire.qualifier.bean.Helper;


public class App 
{
	@SuppressWarnings("resource")
	public static void main( String[] args ) {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	Helper call = (Helper) context.getBean(Helper.class);
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		System.out.println("");
    		System.out.println("1. Show");
    		System.out.println("2. Exit");
    		System.out.print("Enter Your Choice :: ");
    		int choice = sc.nextInt();
    		if(choice == 1) {
    			call.getImain().showDetails();
    		}
    		else {
    			System.out.println("Good Byeee....");
    			return;
    		}
    	}
    }
}
