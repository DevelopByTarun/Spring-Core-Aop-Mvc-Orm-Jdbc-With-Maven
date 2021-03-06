package com.examples;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
@Order(3)
public class AroundAdvice {
	
	@Around(value = "execution (* com.examples.App.*(..))")
	public Object executeAroundAdvice(ProceedingJoinPoint joinpoint) throws Throwable
	{
		System.out.println("before executing App using around advice");
		joinpoint.proceed();
		System.out.println("after executing App using around advice");
		return "";
	}
}