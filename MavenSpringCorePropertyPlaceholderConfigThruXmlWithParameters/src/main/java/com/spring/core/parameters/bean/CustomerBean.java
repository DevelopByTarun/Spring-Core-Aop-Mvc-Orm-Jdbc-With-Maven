package com.spring.core.parameters.bean;

public class CustomerBean implements ICustomer {
	
	private String name;
	
	private int age; 
	
	private String city;
	
	private int pincode;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public void getCustomerDetails() {
		// TODO Auto-generated method stub
		System.out.println("Customer Name Is :: "+this.getName());
		System.out.println("Customer Age Is :: "+this.getAge());
		System.out.println("Customer City Is :: "+this.getCity());
		System.out.println("Customer City Pincode Is :: "+this.getPincode());
	}
}
