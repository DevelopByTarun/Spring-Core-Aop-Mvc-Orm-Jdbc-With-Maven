package com.examples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class JavaConfigExample 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigExample.class);
    	App app = context.getBean(App.class);
        app.printHelloWorld();
        context.close();
    }
    
    @Bean
    public App getApp()
    {
    	return new App();
    }
    
    @Bean
    public AroundAdvice getAspect()
    {
    	return new AroundAdvice();
    }
    
    @Bean
    public BeforeAdvice getBeforeAspect()
    {
    	return new BeforeAdvice();
    }
    
    @Bean
    public AfterAdvice getAfterAspect()
    {
    	return new AfterAdvice();
    }
}
