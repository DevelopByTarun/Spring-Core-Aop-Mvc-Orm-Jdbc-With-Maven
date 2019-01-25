package com.demo.withoutxml.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration		// made spring.xml
public class Config {
	
	@Bean
	AddressBean getAddessBean() {
		AddressBean ab = new AddressBean();
		ab.setState("Sydney");
		ab.setPincode(1341341);
		return ab;
	}
		
	@Bean(name = "iemployee")
	IEmployee getIEmployee() {
		EmployeeBean eb = new EmployeeBean();
		eb.setName("Tarun");
		eb.setDept("Research And Development");
		return eb;
	}
}


