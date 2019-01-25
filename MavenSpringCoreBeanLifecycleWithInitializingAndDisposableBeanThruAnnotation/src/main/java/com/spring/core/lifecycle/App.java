package com.spring.core.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.spring.core.lifecycle.bean.AppConfig;
import com.spring.core.lifecycle.bean.IPerson;

@ComponentScan(basePackages = "com.spring.core.lifecycle.bean")
public class App 
{
    public static void main( String[] args ) {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	((AbstractApplicationContext) context).start();
    	IPerson per = (IPerson) context.getBean("person");
    	per.getPersonDetails();
    	
    	((AbstractApplicationContext) context).close();
//    	or
//    	((AbstractApplicationContext) context).registerShutdownHook();
    }
}
