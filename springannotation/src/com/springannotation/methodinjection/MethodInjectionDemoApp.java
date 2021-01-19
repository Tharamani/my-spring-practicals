/**
 * 
 */
package com.springannotation.methodinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Thara
 *@creation date & time: 5 Nov 2020 11:51:52 am
 */
public class MethodInjectionDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextMethodInjection.xml");
		
		//get bean from spring container
		Coach coach = context.getBean("tennisCoachMethodInjection", Coach.class);
		
		// call method on the bean
		System.out.println(coach.getDailyWorkout());
		
		//call new method for fortune service
		System.out.println(coach.getDailyFortuneService());
		
		//close context
		context.close();
	}

}
