/**
 * 
 */
package com.springannotation.constructorinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Thara
 *@creation date & time: 4 Nov 2020 7:17:32 pm
 */
@Component
public class TennisCoachDependencyInjection implements Coach{
	
	private FortuneService iFortuneService;
 	
	/**
	 * @param iFortuneService
	 */
	public
	//@Autowired
	@Autowired
	TennisCoachDependencyInjection(FortuneService iFortuneService) {
		System.out.println("TennisCoachDependencyInjection: inside parameterized constructor - TennisCoachDependencyInjection");
		this.iFortuneService = iFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return " Practice your backhand Volley";
	}

	@Override
	public String getDailyFortuneService() {
		return iFortuneService.getFortune();
	}

}
