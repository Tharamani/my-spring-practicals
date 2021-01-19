/**
 * 
 */
package com.springannotation.dependencyqualifiers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Thara
 *@creation date & time: 5 Nov 2020 12:36:37 pm
 */
public class DependencyQualifiersDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContextDependencyQualifiers.xml");

		// get bean from spring container
		Coach coach = context.getBean("tennisCoachDependencyQualifiers", Coach.class);

		// call method on the bean
		System.out.println(coach.getDailyWorkout());

		// call new method for fortune service
		System.out.println(coach.getDailyFortuneService());

		// close context
		context.close();
	}
}
