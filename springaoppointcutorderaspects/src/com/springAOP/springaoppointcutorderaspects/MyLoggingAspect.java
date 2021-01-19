/**
 * 
 */
package com.springAOP.springaoppointcutorderaspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Thara
 * @creation date & time: 7 Dec 2020 11:22:47 pm
 */
@Aspect
@Component
@Order(2)
public class MyLoggingAspect {
	
	//apply incluse package ...excluse getter and setter pointcuts to advice
	@Before("com.springAOP.springaoppointcutorderaspects.MyAopExpressions.forDaoPackageNogetterAndSetter()")
	public void beforeAddAccountAdvice() {
		System.out.println();
		System.out.println(getClass() + "==============>>>>>> advice on addAccount()");
	}
}
