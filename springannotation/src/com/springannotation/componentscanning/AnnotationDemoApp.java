/**
 * 
 */
package com.springannotation.componentscanning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Thara
 * @creation date & time: 4 Nov 2020 1:55:07 pm
 */
public class AnnotationDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean using explicit bean id
		Coach coach = context.getBean("thatSillyCoach", Coach.class);
		
		// get the bean using default bean id
		//Coach coach = context.getBean("tennisCoachImplicitBeanId", Coach.class);

		// call the method on bean
		System.out.println(coach.getDailyWorkout());

		// close the context
		context.close();
	}

}
