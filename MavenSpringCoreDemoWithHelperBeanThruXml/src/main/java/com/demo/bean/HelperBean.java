package com.demo.bean;

public class HelperBean {

	private IEmployee iemployee ;
	
	public void setIemployee(IEmployee iemployee) {
		this.iemployee = iemployee;
	}

	public void getEmployee() {
		this.iemployee.getEmployee();
	}

	public void showHomeAddress() {
		this.iemployee.showHomeAddress();
	}

	public void showOfficeAddress() {
		this.iemployee.showOfficeAddress();
	}
}
