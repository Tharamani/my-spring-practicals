/**
 * 
 */
package com.springannotation.assignment.activity6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springannotation.assignment.activity7.Coach;
import com.springannotation.assignment.activity7.FortuneService;

/**
 * @author Thara
 *@creation date & time: 7 Nov 2020 6:37:46 pm
 */
@Component
public class PingPongCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;

	/**
	 * 
	 */
	public PingPongCoach() {
	System.out.println("PingPongCoach: inside no-args constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your pingpong drop shot";
	}

	@Override
	public String getDailyFortuneService() {
		return fortuneService.getFortune();
	}

}
