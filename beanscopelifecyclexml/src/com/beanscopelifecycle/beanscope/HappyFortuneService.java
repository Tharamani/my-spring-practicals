/**
 * 
 */
package com.beanscopelifecycle.beanscope;

import com.beanscopelifecycle.specifications.FortuneService;

/**
 * @author Thara
 *
 * @creation date & time: 1 Nov 2020 5:31:41 pm
 */
public class HappyFortuneService implements FortuneService {
	
	/**
	 *  no-args constructor
	 */
	public HappyFortuneService() {
		System.out.println("HappyFortuneService: no-argument constructor");
	}

	public String getFortune() {
		
		return "Today is your lucky day!";
	}

}
