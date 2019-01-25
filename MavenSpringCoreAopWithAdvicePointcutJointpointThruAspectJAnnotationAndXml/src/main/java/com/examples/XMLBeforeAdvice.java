package com.examples;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class XMLBeforeAdvice {
	
	public void executeBeforeAdvice() throws Throwable
	{
		System.out.println("after executing App using before advice");
	}
}