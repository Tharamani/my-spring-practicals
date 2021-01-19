/**
 * 
 */
package com.springannotation.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Thara
 *@creation date & time: 5 Nov 2020 11:06:06 am
 */
public class AutowireCIDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextconstructorinjection.xml");
		
		//get bean from spring container
		Coach coach = context.getBean("tennisCoachDependencyInjection", Coach.class);
		
		//call method on bean
		System.out.println(coach.getDailyWorkout());
		
		//call method to get daily fortune
		System.out.println(coach.getDailyFortuneService());
		
		//close context
		context.close();
	}

}
