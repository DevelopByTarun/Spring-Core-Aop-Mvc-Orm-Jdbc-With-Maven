package com.demo.withoutxml.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "employee")
public class EmployeeBean implements IEmployee {
	
	@Autowired
	private AddressBean addressBean;
	
	private String name;
	
	private String dept;

	public AddressBean getAddressBean() {
		return addressBean;
	}

	public void setAddressBean(AddressBean addressBean) {
		this.addressBean = addressBean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void getEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Employee Name Is :: "+this.getName());
		System.out.println("Employee Department Is :: "+this.getDept());
	}
	
	public void getEmployeeAddress() {
		// TODO Auto-generated method stub
		this.addressBean.getEmployeeAddress();
	}

	public void getEmployeeWithAddress() {
		// TODO Auto-generated method stub
		this.getEmployee();
		this.addressBean.getEmployeeAddress();
	}
}
