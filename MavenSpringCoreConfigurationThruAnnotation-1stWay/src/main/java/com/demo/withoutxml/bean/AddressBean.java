package com.demo.withoutxml.bean;

import org.springframework.stereotype.Component;

@Component(value = "address")
public class AddressBean {
	
	private String state;
	
	private int pincode;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public void getEmployeeAddress() {
		System.out.println("Employee State Is :: "+this.getState());
		System.out.println("Employee Area Pincode Is :: "+this.getPincode());
	}

	@Override
	public String toString() {
		return "Employee Address [state=" + state + ", pincode=" + pincode + "]";
	}
}
