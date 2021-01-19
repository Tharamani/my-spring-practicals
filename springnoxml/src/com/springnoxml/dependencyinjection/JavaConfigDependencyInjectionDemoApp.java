/**
 * 
 */
package com.springnoxml.dependencyinjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springnoxml.dependencyinjection.Coach;
import com.springnoxml.dependencyinjection.SportConfig;

/**
 * @author Thara
 *@creation date & time: 6 Nov 2020 1:47:53 pm
 */
public class JavaConfigDependencyInjectionDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get bean from spring container
		Coach coach = context.getBean("swimCoach", Coach.class);
		
		// call method on the bean
		System.out.println(coach.getDailyWorkout());
		
		//call new method for fortune service
		System.out.println(coach.getDailyFortuneService());
		
		//close context
		context.close();

	}

}
