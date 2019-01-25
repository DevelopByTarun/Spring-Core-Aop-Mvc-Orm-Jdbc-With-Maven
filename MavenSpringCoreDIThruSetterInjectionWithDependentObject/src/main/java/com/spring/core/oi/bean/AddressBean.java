package com.spring.core.oi.bean;

public class AddressBean {
	
	private String city;
	
	private String state;
	
	private int pincode;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

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

	public void getHAddress() {
		System.out.println("Employee Home City Is :: "+this.getCity());
		System.out.println("Employee Home State Is :: "+this.getState());
		System.out.println("Employee Home Pincode Is :: "+this.getPincode());
	}
	
	public void getOAddress() {
		System.out.println("Employee Office City Is :: "+this.getCity());
		System.out.println("Employee Office State Is :: "+this.getState());
		System.out.println("Employee Office Pincode Is :: "+this.getPincode());
	}

	@Override
	public String toString() {
		return "AddressBean [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
}
