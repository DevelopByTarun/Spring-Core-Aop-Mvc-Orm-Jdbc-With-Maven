package com.spring.core.autowire.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
	
	@Bean
	@Scope("prototype")
	CompanyBean getCompanyBean() {
		CompanyBean cb = new CompanyBean();
		cb.setCompanyName("TataPower Pvt Ltd");
		cb.setCompanyLocation("NewDelhi");
		return cb;
	}
	
	@Bean(name = "iemployee")
	@Scope("prototype")
	IEmployee getIEmployee() {
		EmployeeBean eb = new EmployeeBean();
		eb.setId(1006);
		eb.setName("Neeraj Garg");
		return eb;
	}
}
