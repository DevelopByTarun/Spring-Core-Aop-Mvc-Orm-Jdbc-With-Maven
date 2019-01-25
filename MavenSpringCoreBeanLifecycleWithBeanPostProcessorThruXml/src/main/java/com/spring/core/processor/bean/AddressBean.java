package com.spring.core.processor.bean;

import org.springframework.stereotype.Component;

@Component(value = "address")
public class AddressBean {
	
	public AddressBean() {
		System.out.println("Constructor Of AddressBean Is Called");
	}
	
	private String city;
	
	private String pincode;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	public void initCallBack() {
		System.out.println("InitCallBack Method Of AddressBean Is Called");
	}
	
	public void destroyCallBack() {
		System.out.println("DestroyCallBack Method Of AddressBean Is Called");
	}

	@Override
	public String toString() {
		return "AddressBean [city=" + city + ", pincode=" + pincode + "]";
	}
}
