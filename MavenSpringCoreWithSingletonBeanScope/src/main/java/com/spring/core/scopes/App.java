package com.spring.core.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.core.scopes.bean.SingletonBean;

public class App 
{
	@SuppressWarnings("resource")
	public static void main( String[] args ) {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    	
    	SingletonBean singletonBeanA = (SingletonBean) ac.getBean("singletonObj");
    	System.out.println(singletonBeanA);
    	
    	SingletonBean singletonBeanB = (SingletonBean) ac.getBean("singletonObj");
    	System.out.println(singletonBeanB);
    	
    	System.out.println("Is singletonBeanA And singletonBeanB Is Same ? "+(singletonBeanA==singletonBeanB));
    }
}
