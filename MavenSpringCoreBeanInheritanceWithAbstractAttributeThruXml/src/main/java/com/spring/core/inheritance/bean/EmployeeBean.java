package com.spring.core.inheritance.bean;

public class EmployeeBean implements IEmployee {
	
	private int id;
	
	private String name;
	
	private AddressBean address;

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

	public AddressBean getAddress() {
		return address;
	}

	public void setAddress(AddressBean address) {
		this.address = address;
	}

	public void getEmployee() {
		System.out.println("Employee Id Is :: "+this.getId());
		System.out.println("Employee Name Is :: "+this.getName());
	}
	
	public void getEmployeeWithAddress() {
		this.getEmployee();
		System.out.println("Employee City Is :: "+this.address.getCity());
		System.out.println("Employee Pincode Is :: "+this.address.getPincode());
	}
}
