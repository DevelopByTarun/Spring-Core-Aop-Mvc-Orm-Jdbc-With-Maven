package com.spring.core.lifecycle.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:person.properties")
public class AppConfig {
	
	@Autowired
	Environment environment;
	
	@Bean(name = "person")
	@Scope("singleton")
	@Lazy
	IPerson getIperson() {
		PersonBean pb = new PersonBean();
		pb.setName(environment.getProperty("person.name"));
		pb.setState(environment.getProperty("person.state"));
		return pb;
	}
}
