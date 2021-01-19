/**
 * 
 */
package com.springannotation.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Thara
 * @creation date & time: 6 Nov 2020 11:53:34 am
 */
public class AnnotationBeanLifeCyclePrototypeScode {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContextAnnotationLifeCycle.xml");

		// get bean from spring container
		Coach coach = context.getBean("tennisCoachBeanLifeCycle", Coach.class);

		// call method on the bean
		System.out.println(coach.getDailyWorkout());

		// call new method for fortune service
		System.out.println(coach.getDailyFortuneService());
		
		System.out.println("*********Bean prototype scope:  not executing predestroy method*********************");
		
		Coach alphaCoach = context.getBean("tennisCoachBeanLifeCycle", Coach.class);

		// call method on the bean
		System.out.println(alphaCoach.getDailyWorkout());

		// call new method for fortune service
		System.out.println(alphaCoach.getDailyFortuneService());

		// close context
		context.close();
	}
}
