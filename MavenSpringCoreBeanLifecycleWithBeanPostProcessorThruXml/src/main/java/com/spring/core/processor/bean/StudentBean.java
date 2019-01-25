package com.spring.core.processor.bean;

import org.springframework.stereotype.Component;

@Component(value = "studentBean")
public class StudentBean implements IStudent {
	
	public StudentBean() {
		System.out.println("Constructor Of StudentBean Is Called");
	}
	
	private String name;
	
	private String age;
	
	private AddressBean addressBean;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	public AddressBean getAddressBean() {
		return addressBean;
	}
	
	public void setAddressBean(AddressBean addressBean) {
		this.addressBean = addressBean;
	}
	
	public void initCall() {
		System.out.println("InitCall Method Of StudentBean Is Called");
	}
	
	public void destroyCall() {
		System.out.println("DestroyCall Method Of StudentBean Is Called");
	}

	public void getStudent() {
		// TODO Auto-generated method stub
		System.out.println("Student Name Is :: "+this.getName());
		System.out.println("Student Age Is :: "+this.getAge());
	}

	public void getStudentAddress() {
		// TODO Auto-generated method stub
		System.out.println("Student Live In :: "+this.addressBean.getCity());
		System.out.println("Student City Pincode Is :: "+this.addressBean.getPincode());
	}

	public void getStudentWithAddress() {
		// TODO Auto-generated method stub
		this.getStudent();
		this.getStudentAddress();
	}

	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", age=" + age + ", addressBean=" + addressBean + "]";
	}
}
