package com.app.dao;

public interface QueryInterface {
	
	public static final String INSERT_STUDENT_QUERY = "insert into studentMvc(id, name, age, city) values (?, ?, ?, ?)";
	
	public static final String SELECT_STUDENT_QUERY = "select * from studentMvc";
	
	public static final String DELETE_STUDENT_QUERY = "delete from studentMvc where id = ?";
	
	public static final String SELECTBYID_STUDENT_QUERY = "select * from studentMvc where id = ?";
}
