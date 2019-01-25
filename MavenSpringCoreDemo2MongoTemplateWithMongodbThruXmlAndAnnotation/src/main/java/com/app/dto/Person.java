package com.app.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "PersonBySpring")
public class Person {

	//id will be used for storing MongoDB _id
	@Id
	@Field(value = "person_id")
	private String id;
	
	@Field(value = "person_name")
	private String name;
	
	@Field(value = "person_address")
	private String address;
	
	public Person(){}
	
	public Person(String i, String n, String a){
		this.id=i;
		this.name=n;
		this.address=a;
	}
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
