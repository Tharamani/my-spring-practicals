/**
 * 
 */
package com.springnoxml.beanconfiguration;

import org.springframework.stereotype.Component;

/**
 * @author Thara
 *@creation date & time: 4 Nov 2020 7:14:44 pm
 */
public class HappyFortuneService implements FortuneService {

	/**
	 * 
	 */
	public HappyFortuneService() {
		System.out.println("HappyFortuneService: no-args constructor");
	}
	
	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
