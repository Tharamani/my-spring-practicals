/**
 * 
 */
package com.springnoxml.InjectingProperty;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Thara
 *@creation date & time: 6 Nov 2020 1:43:10 pm
 */
public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	//define two fields for email and team 
	//inject values to fields known as field level injection
	@Value("${foo.email}")
	private String email;
	
	//inject values to fields known as field level injection
	@Value("${foo.team}")
	private String team;
	
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

	/**
	 * @return the fortuneService
	 */
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	/**
	 * @param fortuneService the fortuneService to set
	 */
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}

	/**
	 * @param team the team to set
	 */
	public void setTeam(String team) {
		this.team = team;
	}

}
