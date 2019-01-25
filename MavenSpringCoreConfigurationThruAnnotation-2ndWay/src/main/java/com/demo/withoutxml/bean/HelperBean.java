package com.demo.withoutxml.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class HelperBean {
	
	@Autowired
	private IEmployee iemployee;

	public void setIemployee(IEmployee iemployee) {
		this.iemployee = iemployee;
	}
	
	public void showEmployee() {
		iemployee.getEmployee();
	}
	
	public void showEmployeeAddress() {
		iemployee.getEmployeeAddress();
	}
	
	public void showEmployeeWithAddress() {
		iemployee.getEmployeeWithAddress();
	}
}
