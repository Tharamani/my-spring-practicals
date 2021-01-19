package com.beanscopelifecyclexml.assignment;

import com.beanscopelifecycle.specifications.Coach;

/**
 * @author Thara
 * @creation date & time: 3 Nov 2020 1:51:43 pm
 */
public class BatmintonCoach implements Coach {

	// use FortuneService in BatmintonCoach
	// define private field for dependency
	RandomFortuneService randomFortuneService;

	
	/**
	 * @param randomFortuneService
	 */
	public BatmintonCoach(RandomFortuneService randomFortuneService) {
		System.out.println("BatmintonCoach : inside parameterized constructor - BatmintonCoach");
		this.randomFortuneService = randomFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice two hours everyday!";
	}

	@Override
	public String getDailyFortune() {
		return randomFortuneService.getFortune();
	}

}
