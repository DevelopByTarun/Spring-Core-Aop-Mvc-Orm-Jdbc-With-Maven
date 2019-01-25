package com.spring.core.jsr.bean;

import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "employee")
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
