/**
 * 
 */
package com.springannotation.fieldinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Thara
 *@creation date & time: 5 Nov 2020 12:03:20 pm
 */
@Component
public class TennisCoachFieldInjection implements Coach {

	@Autowired
	private FortuneService FortuneService;
	
	/**
	 * 
	 */
	public TennisCoachFieldInjection() {
	System.out.println("TennisCoachFieldInjection: no-args constructor - TennisCoachFieldInjection");
	}
	@Override
	public String getDailyWorkout() {
		return "Practice backhand Volley";
	}

	@Override
	public String getDailyFortuneService() {
		return FortuneService.getFortune();
	}

}
