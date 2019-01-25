package com.spring.core.oi.bean;

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
		System.out.println("Employee Id Is :: "+this.getEid());
		System.out.println("Employee Name Is :: "+this.getEname());
		System.out.println("Employee City Is :: "+this.getCity());
		System.out.println("Employee Salary Is :: "+this.getSalary());
	}
	
	public void showHomeAddress() {
		System.out.println(this.getHomeAddress());
	}
	
	public void showOfficeAddress() {
		System.out.println(officeAddress.toString());
	}
	
	public void getEmployeeHomeAddress() {
		System.out.println("Employee Id Is :: "+this.eid);
		System.out.println("Employee Name Is :: "+this.ename);
		this.callHAddressMethod();
	}
	
	public void getEmployeeOfficeAddress() {
		System.out.println("Employee Id Is :: "+this.eid);
		System.out.println("Employee Name Is :: "+this.ename);
		this.callOAddressMethod();
	}
	
	public void getEmployeeBothAddress() {
		System.out.println("Employee Id Is :: "+this.eid);
		System.out.println("Employee Name Is :: "+this.ename);
		System.out.println("Employee City Is :: "+this.city);
		System.out.println("Employee Salary Is :: "+this.salary);
		System.out.println("Employee Home City Is :: "+homeAddress.getCity());
		System.out.println("Employee Home State Is :: "+homeAddress.getState());
		System.out.println("Employee Home Pincode Is :: "+homeAddress.getPincode());
		System.out.println("Employee Office City Is :: "+officeAddress.getCity());
		System.out.println("Employee Office State Is :: "+officeAddress.getState());
		System.out.println("Employee Office Pincode Is :: "+officeAddress.getPincode());
	}	
		
	public void callHAddressMethod() {
		homeAddress.getHAddress();
	}
	
	public void callOAddressMethod() {
		officeAddress.getOAddress();
	}	
}
