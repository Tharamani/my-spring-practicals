/**
 * 
 */
package com.springannotation.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Thara
 * @creation date & time: 5 Nov 2020 8:53:37 pm
 */
public class AnnotationBeanScopeDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContextAnnotationScope.xml");

		// retrive bean from spring container
		Coach coach = context.getBean("tennisCoachBeanScope", Coach.class);

		Coach alphaCoach = context.getBean("tennisCoachBeanScope", Coach.class);

		// check if they are same
		boolean result = (coach == alphaCoach);

		// print out the result
		System.out.println("\n pointing to same object: " + result);

		System.out.println("\n memory location for coach: " + coach);

		System.out.println("\n memory location for alphaCoach: " + alphaCoach);

		// close the context
		context.close();
	}

}
