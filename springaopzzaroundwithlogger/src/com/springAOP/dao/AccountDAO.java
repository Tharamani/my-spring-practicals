/**
 * 
 */
package com.springAOP.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springAOP.springaopzzafterfinally.Account;

/**
 * @author Thara
 * @creation date & time: 7 Dec 2020 10:55:33 pm
 */
@Component
public class AccountDAO {

	private String name;
	private String serviceCode;

	/**
	 * @return the name
	 */
	public String getName() {
		System.out.println(getClass() + " : pointcuts combine : getname()");
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		System.out.println(getClass() + " : pointcuts combine : setName()");
		this.name = name;
	}

	/**
	 * @return the serviceCode
	 */
	public String getServiceCode() {
		System.out.println(getClass() + " : pointcuts combine : getServiceCode()");
		return serviceCode;
	}

	/**
	 * @param serviceCode the serviceCode to set
	 */
	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + " : pointcuts combine : setServiceCode()");
		this.serviceCode = serviceCode;
	}

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

	// match package
	public void doWork() {
		System.out.println(getClass() + " : ****** Doing my db work: DO WORK to match package******");
	}

	public List<Account> findAccounts(boolean tripWire) {

		//stimulate exception
		if (tripWire) { 
			throw new RuntimeException("\n" + getClass() + " No soup for you!!! ");
		}
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account("Thara", "gold"));
		accounts.add(new Account("Vish", "platinum"));
		accounts.add(new Account("Arnav", "silver"));
		return accounts;

	}
}
