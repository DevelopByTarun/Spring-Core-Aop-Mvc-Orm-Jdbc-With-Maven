package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.app.bean.User;

public class App 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// we are using production profile
		
	    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
  	    ctx.getEnvironment().setActiveProfiles("prod");
	    ctx.scan("com.app.productionProfileConfig");
	    ctx.refresh();
	    User user = ctx.getBean(User.class);
	    System.out.println("id:"+user.id +", Name:"+ user.name );
}
}
