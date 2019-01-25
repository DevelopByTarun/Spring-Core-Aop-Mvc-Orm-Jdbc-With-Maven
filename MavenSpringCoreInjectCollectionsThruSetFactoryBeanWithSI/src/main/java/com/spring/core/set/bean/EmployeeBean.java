package com.spring.core.set.bean;

import java.util.Set;

public class EmployeeBean implements IEmployee {
	
	private int eid;

	private String ename;

	private String city;

	private double salary;

	private Set<String> addressName;

	private Set<AddressBean> addressSet;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Set<String> getAddressName() {
		return addressName;
	}

	public void setAddressName(Set<String> addressName) {
		this.addressName = addressName;
	}

	public Set<AddressBean> getAddressSet() {
		return addressSet;
	}

	public void setAddressSet(Set<AddressBean> addressSet) {
		this.addressSet = addressSet;
	}

	public void getEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("Employee Id Is :: "+this.getEid());
		System.out.println("Employee Name Is :: "+this.getEname());
		System.out.println("Employee City Is :: "+this.getCity());
		System.out.println("Employee Salary Is :: "+this.getSalary());
	}

	public void showAddressName() {
		// TODO Auto-generated method stub
		System.out.println("Employee Address Country :: "+this.getAddressName());
	}

	public void showAddressSet() {
		// TODO Auto-generated method stub
		System.out.println("Employee Address Set :: "+this.getAddressSet());
	}

	@Override
	public String toString() {
		return "EmployeeBean [eid=" + eid + ", ename=" + ename + ", city=" + city + ", salary=" + salary
				+ ", addressName=" + addressName + ", addressSet=" + addressSet + "]";
	}
}
