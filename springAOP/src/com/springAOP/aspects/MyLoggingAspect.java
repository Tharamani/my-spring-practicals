/**
 * 
 */
package com.springAOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
	//@Before("execution(public void addAccount())") //matches "addAccount" in MembershipDAO and AccountDAO
	//@Before("execution(public void com.springAOP.dao.AccountDAO.addAccount())") //matches "addAccount" AccountDAO
	/*
	 * @Before("execution(void add*())") //match addAccount methods with add(*-any)which has return type
	 *  void public void beforeAddAccountAdvice() {
	 * 
	 * System.out.println("\n==============>>>>>>@Before advice on addAccount()"); }
	 */
	
	//any return type
	/*
	 * @Before("execution(* add*())") //execute methods starting with
	 * add(*-any)which has return type void public void beforeAddAccountAdvice() {
	 * 
	 * System.out.println("\n==============>>>>>>@Before advice on addAccount()"); }
	 */
	
	//match addAccount methods with no- arguments
	/*
	 * @Before("execution(* addAccount())") //execute methods starting with
	 * add(*-any)which has return type void public void beforeAddAccountAdvice() {
	 * 
	 * System.out.println("\n==============>>>>>>@Before advice on addAccount()"); }
	 */
	
	//match addAccount methods with account param type(only one of any type)
	//@Before("execution(* add*(com.springAOP.aspects.Account))")
	/*
	 * @Before("execution(* add*(Account))") public void beforeAddAccountAdvice() {
	 * 
	 * System.out.println("\n==============>>>>>>@Before advice on addAccount()"); }
	 */
	
	//match addAccount methods with any number of arguments(0-many) of any type
	/*
	 * @Before("execution(* add*(..))") public void beforeAddAccountAdvice() {
	 * 
	 * System.out.println("\n==============>>>>>>@Before advice on addAccount()"); }
	 */
	
	//match any method in our DAO package
	@Before("execution(* com.springAOP.dao.*.*(..))")
	public void beforeAddAccountAdvice() {

		System.out.println("\n==============>>>>>>@Before advice on addAccount()");
	}
	
	//no "updateAccount" match found
	@Before("execution(public void updateAccount())")
	public void beforeupdateAccountAdvice() {

		System.out.println("==============>>>>>>@Before advice on updateAccount()");
	}
}
