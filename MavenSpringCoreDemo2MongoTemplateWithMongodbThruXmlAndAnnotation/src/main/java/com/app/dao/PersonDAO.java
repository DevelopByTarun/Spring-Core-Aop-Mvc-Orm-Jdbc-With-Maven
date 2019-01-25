package com.app.dao;

import com.app.dto.Person;

public interface PersonDAO {

	public void create(Person p);
	
	public Person readById(String id);
	
	public void update(Person p);
	
	public int deleteById(String id);
}
