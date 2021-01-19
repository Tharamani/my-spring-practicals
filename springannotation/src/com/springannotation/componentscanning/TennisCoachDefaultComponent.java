/**
 * 
 */
package com.springannotation.componentscanning;

import org.springframework.stereotype.Component;

/**
 * @author Thara
 *@creation date & time: 4 Nov 2020 2:15:29 pm
 */
@Component //default component
public class TennisCoachDefaultComponent implements Coach {

	@Override
	public String getDailyWorkout() {
		return "I'm executing from : TennisCoachImplicitBeanId " + "Practice your backhand Volley";
	}

	@Override
	public String getDailyFortuneService() {
		// TODO Auto-generated method stub
		return null;
	}
}
