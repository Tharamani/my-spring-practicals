/**
 * 
 */
package com.springannotation.assignment;

import org.springframework.stereotype.Component;

/**
 * @author Thara
 *@creation date & time: 4 Nov 2020 2:40:15 pm
 */
//@Component("myHockeyCoach") (Explicit component name)
@Component						//(default component name)
public class FieldHockeyCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice Hockey everyday for 4 hours";
	}

	@Override
	public String getDailyFortuneService() {
		// TODO Auto-generated method stub
		return null;
	}

}
