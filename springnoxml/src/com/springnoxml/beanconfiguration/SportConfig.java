/**
 * 
 */
package com.springnoxml.beanconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Thara
 *@creation date & time: 6 Nov 2020 1:05:55 pm
 */
@Configuration
public class SportConfig {

	/**
	 * 
	 */
	@Bean
	public Coach swimCoach() {

		return new SwimCoach();
	}
}
