/**
 * 
 */
package com.springAOP.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springAOP.config.ConfigAOP;
import com.springAOP.dao.AccountDAO;
import com.springAOP.dao.MembershipDAO;
import com.springAOP.springaoppointcutdeclarationscombine.Account;

/**
 * @author Thara
 * @creation date & time: 7 Dec 2020 11:03:19 pm
 */
public class BeforeAdviceAOPDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				ConfigAOP.class);

		// get the bean from spring container
		AccountDAO accountDAO = annotationConfigApplicationContext.getBean("accountDAO", AccountDAO.class);

		// get membershipdao bean from spring container
		MembershipDAO membershipDAO = annotationConfigApplicationContext.getBean("membershipDAO", MembershipDAO.class);

		// call the business method from accountdao
		// accountDAO.addAccount();

		// call business method from membershipdao
//		membershipDAO.addAccount();

		// call business logic when two methods have same name addAccount()
		// accountDAO.addAccount();

		// call business logic to match account type param for addAccount
		//accountDAO.addAccount(new Account());
		
		accountDAO.addAccount(new Account(), true);
		accountDAO.doWork();

		//call the addaccounts getters/setters method
		accountDAO.setName("foobar");
		accountDAO.setServiceCode("silver");
		
		String name = accountDAO.getName();
		String sc = accountDAO.getServiceCode();
		
		// call business logic with different return type
		membershipDAO.addSillyMember();
		membershipDAO.goToSleep();
		
		// close the context
		annotationConfigApplicationContext.close();
	}

}
