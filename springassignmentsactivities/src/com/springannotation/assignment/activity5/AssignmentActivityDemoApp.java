/**
 * 
 */
package com.springannotation.assignment.activity5;

import org.springframework.context.support.ClassPathXmlApplicationContext;


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
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAssignmentActivity8.xml");

		// get bean from the container (Explicit component name)
		//Coach coach = context.getBean("myHockeyCoach", Coach.class);

		// get bean from the container (default component name)
		Coach coach = context.getBean("fieldHockeyCoach", Coach.class);

		// call method on the bean
		System.out.println(coach.getDailyWorkout());

		// close the context
		context.close();

	}

}
