/**
 * 
 */
package com.springAOP.springaopreadjoinpoints;

import java.util.Arrays;
import java.util.function.Consumer;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
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
	 
	static Consumer<Account> aName = (account) -> System.out.println("Account getName: " + account.getName());
	static Consumer<Account> aLevel = (account) -> System.out.println("Account getLevel: " + account.getLevel());
	
	//apply incluse package ...excluse getter and setter pointcuts to advice
	@Before("com.springAOP.springaopreadjoinpoints.MyAopExpressions.forDaoPackageNogetterAndSetter()")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
		System.out.println();
		System.out.println(getClass() + "==============>>>>>> advice on addAccount()");
		
		//display method signature
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		System.out.println(getClass() +" methodSignature : "+ methodSignature);
		
		//display method args
		Object[] methoodArgs = joinPoint.getArgs();
		
		Arrays.stream(methoodArgs)
		.filter(sc-> sc instanceof Account)
		.map(sc -> (Account) sc)
		.forEach(aName.andThen(aLevel));
		/*
		 * for(Object object : methoodArgs) { System.out.println("Object : " + object);
		 * if(object instanceof Account) { Account a = (Account) object;
		 * System.out.println("Account name : " + a.getName());
		 * System.out.println("Account level : " + a.getLevel()); } }
		 */
	
	}
}
