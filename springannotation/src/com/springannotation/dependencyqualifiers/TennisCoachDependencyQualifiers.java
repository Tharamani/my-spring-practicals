/**
 * 
 */
package com.springannotation.dependencyqualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Thara
 *@creation date & time: 5 Nov 2020 12:36:05 pm
 */
@Component
public class TennisCoachDependencyQualifiers implements Coach {
	
	@Autowired(required = true)
	@Qualifier("happyFortuneService")
	//@Qualifier("databaseFortuneService")
	//@Qualifier("RESTFortuneService")
	//@Qualifier("randomFortuneService")
	private FortuneService FortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Practice backhand Volley";
	}

	@Override
	public String getDailyFortuneService() {
		return FortuneService.getFortune();
	}

}
