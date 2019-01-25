package com.spring.core.di.bean;

import javax.inject.Named;

@Named(value = "address")
public class AddressBean {
	
	private String city;
	
	private int pincode;
	
	public AddressBean(String city, int pincode) {
		this.city = city;
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public int getPincode() {
		return pincode;
	}

	@Override
	public String toString() {
		return "AddressBean [city=" + city + ", pincode=" + pincode + "]";
	}
}
