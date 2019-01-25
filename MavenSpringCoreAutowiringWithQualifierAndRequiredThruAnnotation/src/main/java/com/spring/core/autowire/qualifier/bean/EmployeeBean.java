package com.spring.core.autowire.qualifier.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component(value = "employee")
public class EmployeeBean implements IEmployee{
	
	private int id;
	
	private String name;
	
	@Autowired
	@Qualifier(value = "homeAddr")
	private AddressBean homeAddress;
	
	@Autowired
	@Qualifier(value = "officeAddr")
	private AddressBean officeAddress;

	public int getId() {
		return id;
	}
	
	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	@Required
	public void setName(String name) {
		this.name = name;
	}

	public AddressBean getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(AddressBean homeAddress) {
		this.homeAddress = homeAddress;
	}

	public AddressBean getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(AddressBean officeAddress) {
		this.officeAddress = officeAddress;
	}

	public void displayEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Employee Id Is :: "+this.getId());
		System.out.println("Employee Name Is :: "+this.getName());
	}

	public void displayEmployeeHomeAddress() {
		// TODO Auto-generated method stub
		System.out.println("Employee Home State Is :: "+this.homeAddress.getState());
		System.out.println("Employee Home Pincode Is :: "+this.homeAddress.getPincode());
	}

	public void displayEmployeeOfficeAddress() {
		// TODO Auto-generated method stub
		System.out.println("Employee Office State Is :: "+this.officeAddress.getState());
		System.out.println("Employee Office Pincode Is :: "+this.officeAddress.getPincode());
	}

	public void displayEmployeeWithBothAddress() {
		// TODO Auto-generated method stub
		this.displayEmployee();
		System.out.println(this.homeAddress.toString());
		System.out.println(this.officeAddress.toString());
	}
}
