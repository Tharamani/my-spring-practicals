/**
 * 
 */
package com.springnoxml.beanconfiguration;

import org.springframework.stereotype.Component;

/**
 * @author Thara
 *@creation date & time: 6 Nov 2020 1:43:10 pm
 */
public class SwimCoach implements Coach {

	FortuneService fortuneService;
	
	/**
	 * 
	 */
	public SwimCoach() {
	System.out.println("SwimCoach: - no-args constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice swimming every day for 3 hrs!";
	}

	@Override
	public String getDailyFortuneService() {
		return null;
	}

}
