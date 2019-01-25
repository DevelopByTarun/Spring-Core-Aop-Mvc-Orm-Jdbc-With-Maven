package com.spring.core.si.bean;

public class EmployeeBean implements IEmployee {
	
	private int eid;
	
	private String name;
	
	private String city;
	
	private double salary;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	public void showRecord() {
		System.out.println("Employee Id Is :: "+this.getEid());
		System.out.println("Employee Name Is :: "+this.getName());
		System.out.println("Employee City Is :: "+this.getCity());
		System.out.println("Employee Salary Is :: "+this.getSalary());
	}
}
