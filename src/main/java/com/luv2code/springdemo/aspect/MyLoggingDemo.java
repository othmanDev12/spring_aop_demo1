package com.luv2code.springdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyLoggingDemo {
	
	// let's start with before advice
	@Before("com.luv2code.springdemo.aspect.LuvAopExpression.forDaoPackegeNotGetterAndSetter()")
	public void beforeAdviceAddAccount() {
		System.out.println("======>>> Execution before Advice on addAccount()");
	}
}
