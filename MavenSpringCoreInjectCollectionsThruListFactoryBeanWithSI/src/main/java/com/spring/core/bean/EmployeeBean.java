package com.spring.core.bean;

import java.util.List;

public class EmployeeBean implements IEmployee {
	
	private int eid;
	
	private String ename;
	
	private String city;
	
	private double salary;
	
	private List<String> addressName;
	
	private List<AddressBean> addressList;

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

	public List<String> getAddressName() {
		return addressName;
	}

	public void setAddressName(List<String> addressName) {
		this.addressName = addressName;
	}

	public List<AddressBean> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<AddressBean> addressList) {
		this.addressList = addressList;
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
		System.out.println("Employee Home Address Country :: "+this.getAddressName().get(0));
		System.out.println("Employee Office Address Country :: "+this.getAddressName().get(1));
	}

	public void showAddressList() {
		// TODO Auto-generated method stub
		System.out.println("Employee Home Address List :: "+this.getAddressList().get(0));
		System.out.println("Employee Office Address List :: "+this.getAddressList().get(1));
	}

	@Override
	public String toString() {
		return "EmployeeBean [eid=" + eid + ", ename=" + ename + ", city=" + city + ", salary=" + salary
				+ ", addressName=" + addressName + ", addressList=" + addressList + "]";
	}
}
