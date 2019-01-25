package com.spring.core.parameters.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {
	
	@Autowired
	@Qualifier(value = "oracle")
	private IDatabase database;

	public void setDatabase(IDatabase database) {
		this.database = database;
	}
	
	public void getdatabaseInfo() {
		database.getDatabaseInfo();
	}
}
