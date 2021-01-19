/**
 * 
 */
package com.springannotation.beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Thara
 *@creation date & time: 5 Nov 2020 12:36:05 pm
 */
@Component
@Scope("prototype")
public class TennisCoachBeanScope implements Coach {
	
	@Autowired(required=true)
	@Qualifier("happyFortuneService")
	private FortuneService FortuneService;
	
	/**
	 * 
	 */
	public TennisCoachBeanScope() {
		System.out.println("TennisCoachBeanScope: no-args constructor");
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
