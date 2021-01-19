/**
 * 
 */
package com.springannotation.setterinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Thara
 *@creation date & time: 5 Nov 2020 11:32:39 am
 */
public class SetterInjectionDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextSetterInjection.xml");
		
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
