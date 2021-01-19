/**
 * 
 */
package com.springannotation.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Thara
 * @creation date & time: 6 Nov 2020 11:36:28 am
 */
@Component
public class TennisCoachBeanLifeCycle implements Coach {

	@Autowired
	private FortuneService fortuneService;

	/**
	 * 
	 */
	public TennisCoachBeanLifeCycle() {
		System.out.println("TennisCoachBeanLifeCycle: inside no-args constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice backhand Volley!";
	}

	@Override
	public String getDailyFortuneService() {
		return fortuneService.getFortune();
	}

	// define my init-method
	/**
	 * init-method
	 */
	@PostConstruct
	private void doMyStartupStuff() {
		System.out.println("TennisCoachBeanLifeCycle: ----inside my doMyStartupStuff");
	}
	
	// define my destory-method
	/**
	 * destory-method
	 */
	@PreDestroy
	private void doMyCleanUpStuff() {
		System.out.println("TennisCoachBeanLifeCycle: ---inside my doMyCleanUpStuff");
	}

}
