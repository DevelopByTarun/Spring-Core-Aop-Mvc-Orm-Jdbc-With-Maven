package com.spring.core.lifecycle.bean;

public class StudentBean implements IStudent {
	
	public void callInit() {
		System.out.println("--Spring Container Initialized Thru Lifecycle Custom Init Method--");
		if(this.name != null) {
			System.out.println("Student Name Property Initialized With Value :: "+this.name);
		}
		System.out.println("");
	}
	
	private String name;
	
	private String city;

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
	
	public void callDestroy() {
		System.out.println("--Spring Container Destroy Thru Lifecycle Custom Destroy Method--");
	}

	public void getStudentInfo() {
		// TODO Auto-generated method stub
		System.out.println("Student Name Is :: "+this.getName());
		System.out.println("Student Live In :: "+this.getCity());
	}
}
