/**
 * 
 */
package com.springnoxml.InjectingProperty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Thara
 * @creation date & time: 6 Nov 2020 1:05:55 pm
 */
@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {

	/**
	 * define bean for our sad fortune service
	 */
	@Bean
	public Coach swimCoach() {

		return new SwimCoach(sadFortuneService());
	}

	/**
	 * @return
	 * define bean for our swim coach and inject dependency
	 */
	private SadFortuneService sadFortuneService() {
		return new SadFortuneService();
	}
}
