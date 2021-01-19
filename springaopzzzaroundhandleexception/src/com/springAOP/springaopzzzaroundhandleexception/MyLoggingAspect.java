/**
 * 
 */
package com.springAOP.springaopzzzaroundhandleexception;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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

	private static Logger myLogger = Logger.getLogger(MyLoggingAspect.class.getName());
	static Consumer<Account> aName = (account) -> myLogger.info("Account getName: " + account.getName());
	static Consumer<Account> aLevel = (account) -> myLogger.info("Account getLevel: " + account.getLevel());

	// add a new advice for @AfterReturning on the findAccounts method
	@AfterReturning(pointcut = "execution(* com.springAOP.dao.AccountDAO.findAccounts(..))", returning = "result")
	public void afterReturningFindAccountAdvice(JoinPoint joinPoint, List<Account> result) {

		// print out method we are advicing on
		String method = joinPoint.getSignature().toShortString();
		myLogger.info(getClass() + "==============>>>>>> executing afterReturning on method " + method);

		// print out result of the method call
		myLogger.info(getClass() + "==============>>>>>> result is: " + result);

		convertAccountNamesToUppercase(result);

		// print out result of the method call
		myLogger.info(getClass() + "==============>>>>>> result after setting to uppercase is: " + result);
	}

	// apply incluse package ...excluse getter and setter pointcuts to advice
	@Before("com.springAOP.springaopzzzaroundhandleexception.MyAopExpressions.forDaoPackageNogetterAndSetter()")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
		myLogger.info(getClass() + "==============>>>>>> beforeAddAccountAdvice()");

		// display method signature
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		myLogger.info(getClass() + " methodSignature : " + methodSignature);

		// display method args
		Object[] methoodArgs = joinPoint.getArgs();

		Arrays.stream(methoodArgs).filter(sc -> sc instanceof Account).map(sc -> (Account) sc)
				.forEach(aName.andThen(aLevel));

		Arrays.stream(methoodArgs).filter(sc -> sc instanceof Boolean).map(sc -> (Boolean) sc)
				.forEach(b -> System.out.println(b));

		/*
		 * for(Object object : methoodArgs) { myLogger.info("Object : " + object);
		 * if(object instanceof Account) { Account a = (Account) object;
		 * myLogger.info("Account name : " + a.getName());
		 * myLogger.info("Account level : " + a.getLevel()); } }
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

	@AfterThrowing(pointcut = "execution(* com.springAOP.dao.AccountDAO.findAccounts(..))", throwing = "exception")
	public void afterThrowingFindAdvice(JoinPoint joinPoint, Throwable exception) {
		// print out which method we are advising on
		// display method signature
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		
		myLogger.info(getClass() + "==============>>>>>> afterThrowingFindAdvice() " + methodSignature);

		// log the exception
		myLogger.info(getClass() + "======================> the exception is: " + exception);
	}

	@After("execution(* com.springAOP.dao.AccountDAO.findAccounts(..))")
	public void afterFinallyFindAdvice(JoinPoint joinPoint) {
		// print out which method we are advising on
		// display method signature
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
				
		myLogger.info(getClass() + "==============>>>>>> afterFinallyFindAdvice() " +methodSignature);

	}
	
	@Around("execution(* com.springAOP.service.TrafficFortuneService.getFortune(..))")
	public Object aroundFindAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
		
		//print out method we are advising on
		// display method signature
		String methodSignature = joinPoint.getSignature().toShortString();
						
		myLogger.info(getClass() + "==============>>>>>> aroundFindAdvice() " + methodSignature);

		//get begin timestamp
		Long begin = System.currentTimeMillis();
		
		Object result = null;
		try {
			//now,lets execute method
			 result = joinPoint.proceed();
			//get end timestamp
				Long end = System.currentTimeMillis();
				
				//compute duration and didplay it
				long duration = begin - end;
				myLogger.info("\n=============> Duration: " + duration/1000.0 + " seconds");
			 return result;
		}catch (Exception e) {
			//log the exception
			myLogger.warning(e.getMessage());
			
			//give user a custom message
			//result = "Major accident! but dont worries, " + " your private AOP helicopter is on the way";
			
			//rethrow exception to caller
			throw e;
		}
	}
}
