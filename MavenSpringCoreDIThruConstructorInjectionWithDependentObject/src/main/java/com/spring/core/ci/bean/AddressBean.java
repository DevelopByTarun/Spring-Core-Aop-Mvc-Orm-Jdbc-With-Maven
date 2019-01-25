package com.spring.core.ci.bean;

public class AddressBean {
	
	private String city;
	
	private String state;
	
	private int pincode;

	public AddressBean(String city, String state, int pincode) {
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	public void getAddress() {
		System.out.println("Employee City Is :: "+this.city);
		System.out.println("Employee State Is :: "+this.state);
		System.out.println("Employee Pincode Is :: "+this.pincode);
	}

	@Override
	public String toString() {
		return "AddressBean [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
}
