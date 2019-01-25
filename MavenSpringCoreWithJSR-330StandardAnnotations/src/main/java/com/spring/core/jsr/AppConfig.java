package com.spring.core.jsr;

import javax.inject.Singleton;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.spring.core.jsr.bean.AddressBean;
import com.spring.core.jsr.bean.EmployeeBean;
import com.spring.core.jsr.repo.ICompany;
import com.spring.core.jsr.repo.ICompanyImple;

@Configuration
public class AppConfig {
	
	@Bean
	AddressBean getAddressBean() {
		AddressBean ab = new AddressBean();
		ab.setCity("Auckland");
		ab.setPincode(4564365);
		return ab;
	}
	
	@Bean
	EmployeeBean getEmployeeBean() {
		EmployeeBean eb = new EmployeeBean();
		eb.setId(1001);
		eb.setName("Tarun");
		return eb;
	}
	
	@Bean(name = "icompany")
	@Singleton
	ICompany getICompany() {
		return new ICompanyImple();
	}
}
