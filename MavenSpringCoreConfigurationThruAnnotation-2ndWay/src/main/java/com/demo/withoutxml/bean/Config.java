package com.demo.withoutxml.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration		// made spring.xml
public class Config {
	
	@Bean
	AddressBean getAddessBean() {
		AddressBean ab = new AddressBean();
		ab.setState("Delhi");
		ab.setPincode(110089);
		return ab;
	}
	
	@Bean
	EmployeeBean getEmployeeBean() {
		EmployeeBean eb = new EmployeeBean();
		eb.setName("Varun");
		eb.setDept("Research");
		return eb;
	}
		
	@Bean(name = "helperBean")
	@Scope("prototype")
	HelperBean getHelperBean() {
		return new HelperBean();
	}
}


