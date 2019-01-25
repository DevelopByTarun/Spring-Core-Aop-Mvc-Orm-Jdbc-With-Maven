package com.app.model;

import javax.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Component
public class StudentDTO {
	
	@NotBlank
	private int id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private int age;
	
	@NotBlank
	private String state;
	
	@NotBlank
	private String country;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/* 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", age=" + age + ", state=" + state + ", country=" + country
				+ "]";
	}
}
