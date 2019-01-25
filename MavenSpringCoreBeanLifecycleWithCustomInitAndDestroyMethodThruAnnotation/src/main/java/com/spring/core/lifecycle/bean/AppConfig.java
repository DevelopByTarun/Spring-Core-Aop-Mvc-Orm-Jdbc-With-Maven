package com.spring.core.lifecycle.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name = "istud", initMethod = "callInit", destroyMethod = "callDestroy")
	IStudent getIStudent() {
		StudentBean sb = new StudentBean();
		sb.setName("Varun");
		sb.setCity("Delhi");
		return sb;
	}
}
