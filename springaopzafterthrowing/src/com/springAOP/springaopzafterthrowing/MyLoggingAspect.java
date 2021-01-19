/**
 * 
 */
package com.springAOP.springaopzafterthrowing;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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

	// add a new advice for @AfterReturning on the findAccounts method
	@AfterReturning(pointcut = "execution(* com.springAOP.dao.AccountDAO.findAccounts(..))", returning = "result")
	public void afterReturningFindAccountAdvice(JoinPoint joinPoint, List<Account> result) {
		System.out.println();

		// print out method we are advicing on
		String method = joinPoint.getSignature().toShortString();
		System.out.println(getClass() + "==============>>>>>> executing afterReturning on method " + method);

		// print out result of the method call
		System.out.println(getClass() + "==============>>>>>> result is: " + result);

		convertAccountNamesToUppercase(result);

		// print out result of the method call
		System.out.println(getClass() + "==============>>>>>> result after setting to uppercase is: " + result);
	}

	// apply incluse package ...excluse getter and setter pointcuts to advice
	@Before("com.springAOP.springaopzafterthrowing.MyAopExpressions.forDaoPackageNogetterAndSetter()")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
		System.out.println();
		System.out.println(getClass() + "==============>>>>>> beforeAddAccountAdvice()");

		// display method signature
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		System.out.println(getClass() + " methodSignature : " + methodSignature);

		// display method args
		Object[] methoodArgs = joinPoint.getArgs();

		Arrays.stream(methoodArgs).filter(sc -> sc instanceof Account).map(sc -> (Account) sc)
				.forEach(aName.andThen(aLevel));
		
		Arrays.stream(methoodArgs).filter(sc -> sc instanceof Boolean).map(sc -> (Boolean) sc)
		.forEach(b->System.out.println(b));

		/*
		 * for(Object object : methoodArgs) { System.out.println("Object : " + object);
		 * if(object instanceof Account) { Account a = (Account) object;
		 * System.out.println("Account name : " + a.getName());
		 * System.out.println("Account level : " + a.getLevel()); } }
		 */
	}

	static Function<Account, String> function = (account) -> {
		return account.getName().toUpperCase();
	};

	// let's post-process the data ...let's modify it
	public void convertAccountNamesToUppercase(List<Account> result) {
		result.forEach(account -> {
			account.setName(function.apply(account));
		});

	}
	
	@AfterThrowing(pointcut = "execution(* com.springAOP.dao.AccountDAO.findAccounts(..))", throwing="exception")
	public void afterThrowingFindAdvice(JoinPoint joinPoint, Throwable exception) {
		//print out which method we are advising on
		System.out.println();
		System.out.println(getClass() + "==============>>>>>> afterThrowingFindAdvice()");

		//log the exception
		System.out.println(getClass() + "======================> the exception is: " + exception);
	}
}
