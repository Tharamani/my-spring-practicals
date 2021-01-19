/**
 * 
 */
package com.springannotation.assignment.activity7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Thara
 *@creation date & time: 9 Nov 2020 1:14:01 pm
 */
@Configuration
public class ApplicationConfig {

	/**
	 * @return 
	 * 
	 */
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	/**
	 * 
	 */
	@Bean
	public Coach gymnasticCoach() {
		return new GymnasticCoach(happyFortuneService());
	}
}
