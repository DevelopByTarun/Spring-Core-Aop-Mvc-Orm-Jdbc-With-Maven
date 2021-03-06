package com.spring.core.parameters.bean;

import org.springframework.stereotype.Component;

@Component
public class MysqlBean implements IDatabase {
	
	private String driver;
	
	private String url;
	
	private String username;
	
	private String password;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void getDatabaseInfo() {
		// TODO Auto-generated method stub
		System.out.println("Mysql Database Driver Is :: "+this.getDriver());
		System.out.println("Mysql Database Url Is :: "+this.getUrl());
		System.out.println("Mysql Database Username Is :: "+this.getUsername());
		System.out.println("Mysql Database Password Is :: "+this.getPassword());
	}
}
