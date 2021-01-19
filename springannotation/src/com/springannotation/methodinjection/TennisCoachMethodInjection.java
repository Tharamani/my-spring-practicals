/**
 * 
 */
package com.springannotation.methodinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Thara
 * @creation date & time: 5 Nov 2020 11:45:18 am
 */
@Component
public class TennisCoachMethodInjection implements Coach {

	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand Volley";
	}

	/**
	 * 
	 */
	@Autowired
	private void doCrazyStuff(FortuneService fortuneService) {
		System.out.println("TennisCoachMethodInjection: inside - doCrazyStuff");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortuneService() {
		return fortuneService.getFortune();
	}

}
