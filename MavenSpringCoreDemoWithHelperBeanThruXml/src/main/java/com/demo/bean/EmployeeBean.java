package com.demo.bean;

public class EmployeeBean implements IEmployee {
	
	private int eid;
	
	private String ename;
	
	private String city;
	
	private double salary;
	
	private AddressBean homeAddress;
	
	private AddressBean officeAddress;

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

	public AddressBean getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(AddressBean officeAddress) {
		this.officeAddress = officeAddress;
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
		System.out.println("Employee Home City :: "+this.getHomeAddress().getCity());
		System.out.println("Employee Home State :: "+this.getHomeAddress().getState());
		System.out.println("Employee Home Pincode :: "+this.getHomeAddress().getPincode());
	}

	public void showOfficeAddress() {
		// TODO Auto-generated method stub
		System.out.println(this.getOfficeAddress().toString());
	}
}
