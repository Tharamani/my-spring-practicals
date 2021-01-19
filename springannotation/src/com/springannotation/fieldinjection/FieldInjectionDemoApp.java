/**
 * 
 */
package com.springannotation.fieldinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Thara
 * @creation date & time: 5 Nov 2020 12:04:58 pm
 */
public class FieldInjectionDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContextFieldInjection.xml");

		// get bean from spring container
		Coach coach = context.getBean("tennisCoachFieldInjection", Coach.class);

		// call method on the bean
		System.out.println(coach.getDailyWorkout());

		// call new method for fortune service
		System.out.println(coach.getDailyFortuneService());

		// close context
		context.close();
	}

}
