package com.spring.core.di.bean;

import javax.inject.Inject;
import org.springframework.stereotype.Component;

@Component(value = "employee")
public class EmployeeBean {
	
	private int id;
	
	private String name;
	
	@Inject
	private AddressBean addressBean;

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

	public AddressBean getAddressBean() {
		return addressBean;
	}

	public void setAddressBean(AddressBean addressBean) {
		this.addressBean = addressBean;
	}
}
