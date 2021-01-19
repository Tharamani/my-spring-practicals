/**
 * 
 */
package com.springannotation.assignment.activity7;

/**
 * @author Thara
 * @creation date & time: 9 Nov 2020 1:32:26 pm
 */
public class HappyFortuneService implements FortuneService {

	/**
	 * 
	 */
	public HappyFortuneService() {
		System.out.println("HappyFortuneService: inside no-args constructor ");
	}

	@Override
	public String getFortune() {
		return "You have a better future!";
	}

}
