package com.examples;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class XMLAfterAdvice {
	
	public void executeAfterAdvice() throws Throwable
	{
		System.out.println("after executing App using after advice");
	}
}
