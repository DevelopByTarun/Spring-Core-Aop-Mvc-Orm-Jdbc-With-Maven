package com.spring.core.processor.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:student.properties")
@PropertySource("classpath:address.properties")
public class AppConfig {
	
	@Autowired
	private Environment environment;
	
	@Bean
	@Scope("singleton")
	StudentBeanPostProcessor getStudentBeanPostProcessor() {
		return new StudentBeanPostProcessor();
	}
	
	@Bean
	@Scope("singleton")
	AddressBeanPostProcessor getAddressBeanPostProcessor() {
		return new AddressBeanPostProcessor();
	}
	
	@Bean(name = "addressBean")
	@Scope("singleton")
	AddressBean getAddressBean() {
		AddressBean ab = new AddressBean();
		ab.setCity(environment.getProperty("address.city"));
		ab.setPincode(environment.getProperty("address.pincode"));
		return ab;
	}
	
	@Bean(name = "istudent")
	@Lazy
	@Scope("singleton")
	IStudent getIStudent() {
		StudentBean sb = new StudentBean();
		sb.setName(environment.getProperty("student.name"));
		sb.setAge(environment.getProperty("student.age"));
		return sb;
	}
}
