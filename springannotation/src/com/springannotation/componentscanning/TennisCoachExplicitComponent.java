/**
 * 
 */
package com.springannotation.componentscanning;

import org.springframework.stereotype.Component;

/**
 * @author Thara
 *@creation date & time: 4 Nov 2020 1:53:17 pm
 */
@Component("thatSillyCoach") // explicit component id
public class TennisCoachExplicitComponent implements Coach {

	@Override
	public String getDailyWorkout() {
		return "I'm executing from : TennisCoachExplicitBeanId " + "Practice your backhand Volley";
	}

	@Override
	public String getDailyFortuneService() {
		// TODO Auto-generated method stub
		return null;
	}

}
