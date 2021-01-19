/**
 * 
 */
package com.springAOP.dao;

import org.springframework.stereotype.Component;

/**
 * @author Thara
 * @creation date & time: 8 Dec 2020 12:53:05 am
 */
@Component
public class MembershipDAO {

	//to apply logging aspects for the methods having same name
	/*
	 * public void addAccount() {
	 * 
	 * System.out.println("\n" + getClass() +
	 * "*********Adding membership accounts*************"); }
	 */

	//to test return type while applying logging aspects
	public boolean addSillyMember() {

		System.out.println(getClass() + "*********Adding Silly Member*************");
		return true;
	}
	
	//match package
	public void goToSleep() {
		System.out.println(getClass() + "*********going to sleep*************");
	}
}
