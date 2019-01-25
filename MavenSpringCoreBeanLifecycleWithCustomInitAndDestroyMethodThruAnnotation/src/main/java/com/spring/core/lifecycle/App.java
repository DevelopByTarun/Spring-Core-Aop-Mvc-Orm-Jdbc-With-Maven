package com.spring.core.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import com.spring.core.lifecycle.bean.IStudent;
import com.spring.core.lifecycle.bean.AppConfig;

@ComponentScan(basePackages = "com.spring.core.lifecycle.bean")
public class App 
{
    public static void main( String[] args ) {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	IStudent stud = (IStudent) context.getBean("istud");
    	stud.getStudentInfo();
    	((AbstractApplicationContext) context).close();
    }
}
