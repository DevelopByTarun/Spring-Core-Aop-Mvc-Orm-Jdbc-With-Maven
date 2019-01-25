package com.spring.core.ci.bean;

public class EmployeeBean implements IEmployee {
	
	private int eid;
	
	private String ename;
	
	private String city;
	
	private double salary;

	public EmployeeBean(int eid, String ename, String city, double salary) {
		this.eid = eid;
		this.ename = ename;
		this.city = city;
		this.salary = salary;
	}
	
	public void getEmployees() {
		System.out.println("Employee Id Is :: "+this.eid);
		System.out.println("Employee Name Is :: "+this.ename);
		System.out.println("Employee City Is :: "+this.city);
		System.out.println("Employee Salary Is :: "+this.salary);
	}
}
