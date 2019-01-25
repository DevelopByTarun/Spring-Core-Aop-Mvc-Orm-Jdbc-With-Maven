package com.spring.core.ci.bean;

public class EmployeeBean implements IEmployee {
	
	private int eid;
	
	private String ename;
	
	private String city;
	
	private double salary;
	
	private AddressBean empAddress;

	public EmployeeBean(int eid, String ename, String city, double salary, AddressBean empAddress) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.city = city;
		this.salary = salary;
		this.empAddress = empAddress;
	}
	
	public void getEmployees() {
		System.out.println("Employee Id Is :: "+this.eid);
		System.out.println("Employee Name Is :: "+this.ename);
		System.out.println("Employee City Is :: "+this.city);
		System.out.println("Employee Salary Is :: "+this.salary);
	}
	
	public void getAddress() {
		System.out.println(empAddress.toString());
	}
	
	public void callAddressMethod() {
		empAddress.getAddress();
	}
	
	public void getEmployeesWithAddress() {
		System.out.println("Employee Id Is :: "+this.eid);
		System.out.println("Employee Name Is :: "+this.ename);
		System.out.println("Employee City Is :: "+this.city);
		System.out.println("Employee Salary Is :: "+this.salary);
		this.callAddressMethod();
	}	
}
