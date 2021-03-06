package com.app.snippets.enterprise.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class DoBeforeAspect {

	 @Before("execution(* com.app.snippets.enterprise.SimpleService.sayHello(..))")
	public void doBefore(JoinPoint joinPoint) {

		System.out
				.println("***AspectJ*** DoBefore() is running!! intercepted : "
						+ joinPoint.getSignature().getName());
	}

}
