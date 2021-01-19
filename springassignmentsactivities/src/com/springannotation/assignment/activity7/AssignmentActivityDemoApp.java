/**
 * 
 */
package com.springannotation.assignment.activity7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Thara
 *@creation date & time: 9 Nov 2020 1:46:15 pm
 */
public class AssignmentActivityDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Coach coach = context.getBean("gymnasticCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortuneService());
		context.close();
	}

}
