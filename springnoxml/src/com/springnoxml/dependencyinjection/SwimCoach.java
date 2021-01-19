/**
 * 
 */
package com.springnoxml.dependencyinjection;

/**
 * @author Thara
 *@creation date & time: 6 Nov 2020 1:43:10 pm
 */
public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	/**
	 * @param fortuneService
	 */
	public SwimCoach(FortuneService fortuneService) {
		System.out.println("SwimCoach:  inside parameterized constructor");
		this.fortuneService = fortuneService;
	}

	/**
	 * 
	 */
	public SwimCoach() {
	System.out.println("SwimCoach: - no-args constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warmup";
	}

	@Override
	public String getDailyFortuneService() {
		return fortuneService.getFortune();
	}

}
