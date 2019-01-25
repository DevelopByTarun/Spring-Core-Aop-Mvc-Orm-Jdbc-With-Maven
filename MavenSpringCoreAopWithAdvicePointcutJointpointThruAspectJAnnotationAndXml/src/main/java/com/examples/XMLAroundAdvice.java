package com.examples;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class XMLAroundAdvice {
	
	public Object executeAroundAdvice(ProceedingJoinPoint joinpoint) throws Throwable
	{
		System.out.println("before executing App using around advice");
		
		joinpoint.proceed();
		
		System.out.println("after executing App using around advice");
		return "";
	}
}