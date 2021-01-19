/**
 * 
 */
package com.springAOP.demo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springAOP.config.ConfigAOP;
import com.springAOP.dao.AccountDAO;
import com.springAOP.springaopzafterreturning.Account;

/**
 * @author Thara
 * @creation date & time: 7 Dec 2020 11:03:19 pm
 */
public class AfterReturningDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				ConfigAOP.class);

		// get the bean from spring container
		AccountDAO accountDAO = annotationConfigApplicationContext.getBean("accountDAO", AccountDAO.class);


		//call method to find accounts
		List<Account> accounts = accountDAO.findAccounts();
		
		//didplay accounts
		System.out.println("\n\nAfterReturningDemo : ......");
		System.out.println(accounts);
		// close the context
		annotationConfigApplicationContext.close(); 
	}

}
