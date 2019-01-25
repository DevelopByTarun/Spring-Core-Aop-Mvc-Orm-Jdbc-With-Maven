package com.spring.core.autowire.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "employee")
public class EmployeeBean implements IEmployee {
	
	private int id;
	
	private String name;
	
	@Autowired
	private CompanyBean companyBean;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CompanyBean getCompanyBean() {
		return companyBean;
	}

	public void setCompanyBean(CompanyBean companyBean) {
		this.companyBean = companyBean;
	}

	public void getEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Employee Id Is :: "+this.getId());
		System.out.println("Employee Name Is :: "+this.getName());
	}
	
	public void getEmployeeWithCompanyDetails() {
		// TODO Auto-generated method stub
		this.getEmployee();
		this.companyBean.companyDetails();
	}
}
