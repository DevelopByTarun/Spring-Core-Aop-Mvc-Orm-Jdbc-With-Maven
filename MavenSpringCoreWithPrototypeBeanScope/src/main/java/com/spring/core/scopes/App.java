package com.spring.core.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.core.scopes.bean.PrototypeBean;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ) {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    	
    	PrototypeBean prototypeBeanA = (PrototypeBean) ac.getBean("protoObj");
    	System.out.println(prototypeBeanA);
    	
    	PrototypeBean prototypeBeanB = (PrototypeBean) ac.getBean("protoObj");
    	System.out.println(prototypeBeanB);
    	
    	System.out.println("Is prototypeBeanA And prototypeBeanB Is Same ? "+(prototypeBeanA==prototypeBeanB));
    }
}
