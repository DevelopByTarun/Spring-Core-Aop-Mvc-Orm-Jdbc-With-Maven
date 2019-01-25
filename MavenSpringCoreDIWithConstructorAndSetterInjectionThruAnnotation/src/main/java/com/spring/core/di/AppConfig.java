package com.spring.core.di;

import javax.inject.Singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import com.spring.core.di.bean.AddressBean;
import com.spring.core.di.bean.EmployeeBean;
import com.spring.core.di.repo.ICompany;
import com.spring.core.di.repo.ICompanyImple;

public class AppConfig {
	
	@Bean
	@Scope("singleton")
	AddressBean getAddressBean() {
		AddressBean ab = new AddressBean("Sydney", 8567766);
		return ab;
	}
	
	@Bean
	@Singleton
	@Lazy
	EmployeeBean getEmployeeBean() {
		EmployeeBean eb = new EmployeeBean();
		eb.setId(1002);
		eb.setName("Varun");
		return eb;
	}
	
	@Bean(name = "icomp")
	ICompany getICompany() {
		return new ICompanyImple();
	}
}
