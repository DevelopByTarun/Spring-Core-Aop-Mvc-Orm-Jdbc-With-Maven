package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.app.service.ApplicationMailer;

public class App 
{
    public static void main( String[] args ) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	//Get the mailer instance
        ApplicationMailer mailer = (ApplicationMailer) context.getBean("applicationMailerObject");
 
        //Send a composed mail
        mailer.sendMail("gemini86.tarun@yahoo.com", "Test Subject From Eclipse", "Testing body From Eclipse");
 
        //Send a pre-configured mail
        mailer.sendPreConfiguredMail("Exception Occurred Everywhere.. Where Are You ????");
    }
}
