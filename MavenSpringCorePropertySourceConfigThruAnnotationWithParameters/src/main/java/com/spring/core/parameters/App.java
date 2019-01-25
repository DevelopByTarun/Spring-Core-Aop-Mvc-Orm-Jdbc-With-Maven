package com.spring.core.parameters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.spring.core.parameters.bean.AppConfig;
import com.spring.core.parameters.bean.DatabaseService;

@ComponentScan(basePackages = "com.spring.core.parameters.bean")
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ) {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	DatabaseService db = (DatabaseService) context.getBean("helper");
    	
    	db.getdatabaseInfo();
    	
//    	call for mysql 
//    	[goto DatabaseService class and change the value of qualifier 
//    	 and fill MysqlBean id from AppConfig file]
    }
}
