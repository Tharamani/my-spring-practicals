/**
 * 
 */
package com.springAOP.demo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springAOP.config.ConfigAOP;
import com.springAOP.dao.AccountDAO;
import com.springAOP.springaopzafterthrowing.Account;

/**
 * @author Thara
 * @creation date & time: 7 Dec 2020 11:03:19 pm
 */
public class AfterThrowingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				ConfigAOP.class);

		// get the bean from spring container
		AccountDAO accountDAO = annotationConfigApplicationContext.getBean("accountDAO", AccountDAO.class);

		List<Account> accounts = null;
		try {
			// add a boolean flag to stimulate exception
			boolean tripWire = true;

			// call method to find accounts
			accounts = accountDAO.findAccounts(tripWire);

		} catch (Exception e) {
			System.out.println("\n AfterthrowingDemo : caught exception......" + e);
		}
		
		// display accounts
		System.out.println("\nAfterthrowingDemo : ......");
		System.out.println(accounts);
		
		// close the context
		annotationConfigApplicationContext.close();
	}

}
