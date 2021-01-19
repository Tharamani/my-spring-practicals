/**
 * 
 */
package com.springAOP.springaoppointcutdeclarations;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Thara
 * @creation date & time: 7 Dec 2020 11:22:47 pm
 */
@Aspect
@Component
public class MyLoggingAspect {

	// this is where we add all of our related advices for logging

	// let's start with an @Before advice

	// How to reuse the pointcut expression and apply to different advices?
	// step 1: create pointcut declaration
	@Pointcut("execution(* com.springAOP.dao.*.*(..))")
	private void forDaoPackage() {
	}

	// step 2 : apply pointcut declarations to advice
	// match any method in our DAO package
	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println();
		System.out.println("==============>>>>>>@Before advice on addAccount()");
	}

	@Before("forDaoPackage()")
	public void performApiAnalytics() {

		System.out.println("==============>>>>>>@Before performApiAnalytics()");
	}
}
