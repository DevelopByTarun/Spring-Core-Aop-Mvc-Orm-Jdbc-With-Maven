package com.spring.core.parameters.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:oracledatabase.properties")
@PropertySource("classpath:mysqldatabase.properties")
public class AppConfig {
	
	@Autowired
	Environment environment;
	
	@Bean(name = "oracle")
	OracleBean getOracleBean() {
		OracleBean ob = new OracleBean();
		ob.setDriver(environment.getProperty("oracle.driver"));
		ob.setUrl(environment.getProperty("oracle.url"));
		ob.setUsername(environment.getProperty("oracle.username"));
		ob.setPassword(environment.getProperty("oracle.password"));
		return ob;
	}
	
	@Bean(name = "mysql")
	MysqlBean getMysqlBean() {
		MysqlBean mb = new MysqlBean();
		mb.setDriver(environment.getProperty("mysql.driver"));
		mb.setUrl(environment.getProperty("mysql.url"));
		mb.setUsername(environment.getProperty("mysql.username"));
		mb.setPassword(environment.getProperty("mysql.password"));
		return mb;
	}
	
	@Bean(name = "helper")
	DatabaseService getDatabaseService() {
		return new DatabaseService();
	}
}
