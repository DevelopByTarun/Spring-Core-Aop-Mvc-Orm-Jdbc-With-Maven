package com.spring.core.autowire.bean;

import org.springframework.stereotype.Component;

@Component(value = "company")
public class CompanyBean {
	
	private String companyName;
	
	private String companyLocation;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyLocation() {
		return companyLocation;
	}

	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}
	
	public void companyDetails() {
		System.out.println("Company Name Is :: "+this.getCompanyName());
		System.out.println("Company Location Is :: "+this.getCompanyLocation());
	}
}
