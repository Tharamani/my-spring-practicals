/**
 * 
 */
package com.springannotation.assignment.activity7;

/**
 * @author Thara
 *@creation date & time: 9 Nov 2020 1:16:34 pm
 */
public class GymnasticCoach implements Coach {

	private FortuneService fortuneService;
	
	
	/**
	 * @param fortuneService
	 */
	public GymnasticCoach(FortuneService fortuneService) {
		System.out.println("GymnasticCoach: inside parameterized constructor");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice gymnastic everyday 1 hour!";
	}

	@Override
	public String getDailyFortuneService() {
		return fortuneService.getFortune();
	}

}
