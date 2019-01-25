package com.spring.core.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.core.inheritance.bean.IParent;


public class App 
{
	@SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	IParent parentObj = (IParent) context.getBean("parentObject");
    	System.out.println("=====ParentBean====");
    	parentObj.showMessage();
    	parentObj.showTitle();
    	IParent childObj = (IParent) context.getBean("childObject");
    	System.out.println("=====ParentBean ChildObject====");
    	childObj.showMessage();
    	childObj.showTitle();
    }
}
