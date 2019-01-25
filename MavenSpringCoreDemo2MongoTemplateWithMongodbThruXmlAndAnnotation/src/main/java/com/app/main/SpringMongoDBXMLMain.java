package com.app.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.app.dao.PersonDAO;
import com.app.dto.Person;

public class SpringMongoDBXMLMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		PersonDAO personDAO = ctx.getBean("personDAO", PersonDAO.class);
		
		Person p = new Person(null, "PankajKr", "Bangalore, India");
		Person porn1 = new Person(null, "Tarun", "Sydney, Australia");
		Person porn2 = new Person(null, "Varun", "Delhi, India");
		Person porn3 = new Person(null, "Amit", "Auckland, NewZealand");
		Person porn4 = new Person(null, "Bhupesh", "Calgiri, Canada");
		
		//create
		System.out.println("========Create Person========");
		personDAO.create(p);
		System.out.println("Generated ID="+p.getId());
		
		personDAO.create(porn1);
		System.out.println("Generated ID="+porn1.getId());
		
		personDAO.create(porn2);
		System.out.println("Generated ID="+porn2.getId());
		
		personDAO.create(porn3);
		System.out.println("Generated ID="+porn3.getId());
		
		personDAO.create(porn4);
		System.out.println("Generated ID="+porn4.getId());
		System.out.println("");
		
		
		//read
		System.out.println("========Read Person========");
		Person p1 = personDAO.readById(p.getId());
		System.out.println("Retrieved Person="+p1);
		
		Person p2 = personDAO.readById(porn1.getId());
		System.out.println("Retrieved Person="+p2);
		
		Person p3 = personDAO.readById(porn2.getId());
		System.out.println("Retrieved Person="+p3);
		
		Person p4 = personDAO.readById(porn3.getId());
		System.out.println("Retrieved Person="+p4);
		
		Person p5 = personDAO.readById(porn4.getId());
		System.out.println("Retrieved Person="+p5);
		System.out.println("");
		
		//update
		System.out.println("========Update Person=======");
		p1.setName("David");p1.setAddress("SFO, USA");
		personDAO.update(p1);
		Person temp = personDAO.readById(p1.getId());
		System.out.println("Retrieved Person after update="+temp);
		System.out.println("");
		
		//delete
//		int count = personDAO.deleteById(p1.getId());
//		System.out.println("Number of records deleted="+count);
		
		ctx.close();

	}
}
