package com.spring.core.autowire.qualifier.bean;

import org.springframework.beans.factory.annotation.Required;

public class AddressBean {
	
	private String state;
	
	private int pincode;

	public String getState() {
		return state;
	}
	
	@Required
	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}
	
	@Required
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "AddressBean [state=" + state + ", pincode=" + pincode + "]";
	}
}
