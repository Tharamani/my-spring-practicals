/**
 * 
 */
package com.beanscopelifecycle.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beanscopelifecycle.specifications.Coach;

/**
 * @author Thara
 * @creation date & time: 3 Nov 2020 5:01:25 pm
 */
public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext.xml");

		// get bean from spring container where scope = singleton(default scope)
		Coach coach = context.getBean("myCoach", Coach.class);

		// call the method on bean
		System.out.println(coach.getDailyWorkout());

		// close context
		context.close();
	}
}
