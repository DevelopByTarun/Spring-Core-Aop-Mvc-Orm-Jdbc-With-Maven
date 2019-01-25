package com.spring.core.bean;

public class EmployeeBean implements IEmployee {
	
	private int eid;
	
	private String ename;
	
	private String city;
	
	private double salary;
	
	private AddressBean homeAddress;

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

	public AddressBean getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(AddressBean homeAddress) {
		this.homeAddress = homeAddress;
	}

	public void getEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Employee Id Is :: "+this.getEid());
		System.out.println("Employee Name Is :: "+this.getEname());
		System.out.println("Employee City Is :: "+this.getCity());
		System.out.println("Employee Salary Is :: "+this.getSalary());
	}

	public void showHomeAddress() {
		// TODO Auto-generated method stub
		System.out.println(this.getHomeAddress());
	}

	public void getEmployeeHomeAddress() {
		// TODO Auto-generated method stub
		System.out.println("Employee Id Is :: "+this.eid);
		System.out.println("Employee Name Is :: "+this.ename);
		this.callHAddressMethod();
	}
	
	public void callHAddressMethod() {
		homeAddress.getHAddress();
	}
}
