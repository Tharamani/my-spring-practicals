/**
 * 
 */
package com.springnoxml.InjectingProperty;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springnoxml.InjectingProperty.SportConfig;

/**
 * @author Thara
 * @creation date & time: 6 Nov 2020 5:18:07 pm
 */
public class JavaConfigInjectPropertyDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get bean from spring container
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

		// call method on the bean
		System.out.println(coach.getDailyWorkout());

		// call new method for fortune service
		System.out.println(coach.getDailyFortuneService());

		// call new methods for swimcoach for value injection
		System.out.println(coach.getEmail());

		// call new methods for swimcoach for value injection
		System.out.println(coach.getTeam());

		// close context
		context.close();
	}

}
