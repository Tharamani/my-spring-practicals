/**
 * 
 */
package com.springAOP.dao;

import org.springframework.stereotype.Component;

import com.springAOP.aspects.Account;

/**
 * @author Thara
 * @creation date & time: 7 Dec 2020 10:55:33 pm
 */
@Component
public class AccountDAO {

	// add account
	public void addAccount() {

		System.out.println(getClass() + " : ****** Doing my db work: ADD ACCOUNT with NO-PARAMS******");

	}

	// add account with account type
	public void addAccount(Account account) {

		System.out.println(getClass() + " : ****** Doing my db work: ADD ACCOUNT with ACCOUNT TYPE PARAMS******");

	}

	// add account with account type and more param
	public void addAccount(Account account, boolean vipFlag) {

		System.out.println(getClass() + " : ****** Doing my db work: ADD ACCOUNT with 0-many TYPE PARAMS******");

	}
	
	//match package
	public void doWork() {
		System.out.println(getClass() + " : ****** Doing my db work: DO WORK to match package******");
	}
}
