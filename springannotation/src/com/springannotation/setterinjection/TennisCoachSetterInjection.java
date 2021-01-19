/**
 * 
 */
package com.springannotation.setterinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Thara
 *@creation date & time: 5 Nov 2020 11:29:48 am
 */
@Component
public class TennisCoachSetterInjection implements Coach {

	private FortuneService fortuneService;

	/**
	 * 
	 */
	public TennisCoachSetterInjection() {
		System.out.println("TennisCoachSetterInjection: inside no-args constructor");
	}
	/**
	 * @return the fortuneService
	 */
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	/**
	 * @param fortuneService the fortuneService to set
	 */
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TennisCoachSetterInjection: inside setter - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "TennisCoachSetterInjection: Practice makes man perfect, keep going";
	}

	@Override
	public String getDailyFortuneService() {
		return fortuneService.getFortune();
	}
	
	
}
