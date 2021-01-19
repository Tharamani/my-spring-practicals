/**
 * 
 */
package com.springAOP.springaopzafterthrowing;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author Thara
 * @creation date & time: 15 Dec 2020 7:05:03 pm
 */
@Aspect
public class MyAopExpressions {

	// How to combine the pointcut expression and apply Except getter and setter
	// create pointcut to apply for package
	@Pointcut("execution(* com.springAOP.dao.*.*(..))")
	public void forDaoPackage() {
	}

	// create pointcut for getter()
	@Pointcut("execution(* com.springAOP.dao.*.get*(..))")
	public void getter() {
	}

	// create pointcut for setter()
	@Pointcut("execution(* com.springAOP.dao.*.set*(..))")
	public void setter() {
	}

	// create pointcut : incluse package ...excluse getter and setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNogetterAndSetter() {
	}

}
