package com.spring.core.processor.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("PostConstruct Method Of AddressBean Is Called");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("PreDestroy Method Of AddressBean Is Called");
	}

	@Override
	public String toString() {
		return "AddressBean [city=" + city + ", pincode=" + pincode + "]";
	}
}
