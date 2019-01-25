package com.app;

import java.util.Iterator;
import java.util.Set;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.app.bean.MyCollection;

public class App 
{
	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("spring-config.xml");
		MyCollection myCollection=(MyCollection)context.getBean("parentCollection");
        //access parent collection 
        System.out.println("---Elements in parent bean---");		
        Set<String> parentSet=myCollection.getMySet();
        Iterator<String> itrP= parentSet.iterator();
        while(itrP.hasNext()){
        	System.out.println(itrP.next());
        }
        MyCollection concreteChild=(MyCollection)context.getBean("childCollection");
        //access child collection 
        System.out.println("---Elements in child bean---");        
        Set<String> setC=concreteChild.getMySet();
        Iterator<String> itrC= setC.iterator();
        while(itrC.hasNext()){
        	System.out.println(itrC.next());
        } 
        context.close();
	}
}
