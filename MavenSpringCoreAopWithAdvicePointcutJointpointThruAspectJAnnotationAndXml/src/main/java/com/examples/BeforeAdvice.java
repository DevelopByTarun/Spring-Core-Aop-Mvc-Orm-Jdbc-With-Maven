package com.examples;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class BeforeAdvice {
	
	@Before(value = "execution (* com.examples.App.*(..))")
	public void executeBeforeAdvice() throws Throwable
	{
		System.out.println("after executing App using before advice");
	}
}