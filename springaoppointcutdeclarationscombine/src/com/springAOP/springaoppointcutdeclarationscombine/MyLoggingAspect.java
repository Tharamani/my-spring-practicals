/**
 * 
 */
package com.springAOP.springaoppointcutdeclarationscombine;

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

	// How to combine the pointcut expression and apply Except getter and setter 
	//create pointcut to apply for package
	@Pointcut("execution(* com.springAOP.dao.*.*(..))")
	private void forDaoPackage() {
	}
	
	//create pointcut for getter()
	@Pointcut("execution(* com.springAOP.dao.*.get*(..))")
	private void getter() {
	}
	
	//create pointcut for setter()
	@Pointcut("execution(* com.springAOP.dao.*.set*(..))")
	private void setter() {
	}
	
	//create pointcut : incluse package ...excluse getter and setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void forDaoPackageNogetterAndSetter() {
	}
	
	//apply incluse package ...excluse getter and setter pointcuts to advice
	@Before("forDaoPackageNogetterAndSetter()")
	public void beforeAddAccountAdvice() {
		System.out.println();
		System.out.println("==============>>>>>>@Before advice on addAccount()");
	}

	//apply incluse package ...excluse getter and setter pointcuts to advice
	@Before("forDaoPackageNogetterAndSetter()")
	public void performApiAnalytics() {

		System.out.println("==============>>>>>>@Before performApiAnalytics()");
	}
}
