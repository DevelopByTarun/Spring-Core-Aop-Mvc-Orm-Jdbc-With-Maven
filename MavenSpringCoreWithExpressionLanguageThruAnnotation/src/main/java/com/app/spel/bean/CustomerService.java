package com.app.spel.bean;

public class CustomerService {
	private String name;
	private Customer customer;

	public CustomerService() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "CustomerService [name=" + name + ", customer=" + customer + "]";
	}

}
