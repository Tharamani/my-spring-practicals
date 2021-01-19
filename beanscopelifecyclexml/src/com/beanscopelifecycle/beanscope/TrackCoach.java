/**
 * 
 */
package com.beanscopelifecycle.beanscope;

import com.beanscopelifecycle.specifications.Coach;
import com.beanscopelifecycle.specifications.FortuneService;

/**
 * @author Thara
 *
 * @creation Date & Time : 30 Oct 2020 5:10:32 pm
 */
public class TrackCoach implements Coach {

	// use FortuneService in TrackCoach
	// define private field for dependency
	private FortuneService iFortuneService;

	/**
	 * @param iFortuneService DI = spring framework creates the object and injects
	 *                        the dependency, we write code to initialize dependency
	 */
	public TrackCoach(FortuneService iFortuneService) {
		System.out.println("TrackCoach: parameterized constructor ");
		this.iFortuneService = iFortuneService;
	}

	/**
	 * no-args constructor
	 */
	public TrackCoach() {
		System.out.println("TrackCoach: no-argument constructor");
	}

	/**
	 * Implementation for coach
	 */
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	/**
	 * use FortuneService in TrackCoach
	 */
	public String getDailyFortune() {
		return "Just do it, " + iFortuneService.getFortune();
	}
	
	//add an init method(custom code executed during beans lifecycle, @bean creation)
	/**
	 * bean init-method
	 */
	public void doMyStartupStuff() {
		System.out.println("\n TrackCoach: inside init-method : doMyStartupStuff");
	}
	
	//add a destory method(custom code executed when beans destroy, @bean destruction)
	/**
	 * bean destroy-method
	 */
	public void doMycleanupStuff() {
		System.out.println("\n TrackCoach: inside destroy-method : doMycleanupStuff");
	}
}
