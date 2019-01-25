package com.spring.core.autowire.qualifier.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean(name = "officeAddr")
	AddressBean getOfficeAddress() {
		AddressBean office = new AddressBean();
		office.setState("Sydney");
		office.setPincode(462652);
		return office;
	}
	
	@Bean(name = "homeAddr")
	AddressBean getHomeAddress() {
		AddressBean home = new AddressBean();
		home.setState("India");
		home.setPincode(110089);
		return home;
	}
	
	@Bean(name = "iemp")
	IEmployee getEmployee() {
		EmployeeBean eb = new EmployeeBean();
		eb.setId(1010);
		eb.setName("Tarun");
		return eb;
	}
}
