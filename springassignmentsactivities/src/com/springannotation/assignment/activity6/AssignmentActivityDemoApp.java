/**
 * 
 */
package com.springannotation.assignment.activity6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springannotation.assignment.activity7.Coach;

/**
 * @author Thara
 * @creation date & time: 4 Nov 2020 2:41:05 pm
 */
public class AssignmentActivityDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContextAssignmentActivity6.xml");

		// get bean from the container (default component name)
		Coach coach = context.getBean("pingPongCoach", Coach.class);

		// call method on the bean
		System.out.println(coach.getDailyWorkout());

		// call method on the bean
		System.out.println(coach.getDailyFortuneService());

		// close the context
		context.close();

	}

}
