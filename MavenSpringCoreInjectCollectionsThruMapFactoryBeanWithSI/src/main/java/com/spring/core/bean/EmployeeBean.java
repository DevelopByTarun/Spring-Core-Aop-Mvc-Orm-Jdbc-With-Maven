package com.spring.core.bean;

import java.util.Map;

public class EmployeeBean implements IEmployee {
	
	private int eid;
	
	private String ename;
	
	private String city;
	
	private double salary;
	
	private Map<String, String> addressName;
	
	private Map<String, AddressBean> addressMap;

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

	public Map<String, String> getAddressName() {
		return addressName;
	}

	public void setAddressName(Map<String, String> addressName) {
		this.addressName = addressName;
	}

	public Map<String, AddressBean> getAddressMap() {
		return addressMap;
	}

	public void setAddressMap(Map<String, AddressBean> addressMap) {
		this.addressMap = addressMap;
	}

	public void getEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("Employee Id Is :: "+this.getEid());
		System.out.println("Employee Name Is :: "+this.getEname());
		System.out.println("Employee City Is :: "+this.getCity());
		System.out.println("Employee Salary Is :: "+this.getSalary());
	}

	@SuppressWarnings("rawtypes")
	public void showAddressName() {
		// TODO Auto-generated method stub
		for(Map.Entry map: addressName.entrySet()) {
			System.out.println(map.getKey()+" : "+map.getValue());
		}
	}

	@SuppressWarnings("rawtypes")
	public void showAddressMap() {
		// TODO Auto-generated method stub
		for(Map.Entry map: addressMap.entrySet()) {
			System.out.println(map.getKey()+" : "+map.getValue());
		}
	}

	@Override
	public String toString() {
		return "EmployeeBean [eid=" + eid + ", ename=" + ename + ", city=" + city + ", salary=" + salary
				+ ", addressName=" + addressName + ", addressMap=" + addressMap + "]";
	}
}
