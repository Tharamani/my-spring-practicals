package com.beanscopelifecyclexml.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beanscopelifecycle.specifications.Coach;

/**
 * @author Thara
 * @creation date & time: 3 Nov 2020 1:51:53 pm
 */
public class AssignmentApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeAssignment-applicationContext.xml");

		System.out.println("Singleton scope");
		// retrieve bean from spring container
		Coach coach = context.getBean("myBatmintonCoach", Coach.class);
		System.out.println("\n Memory location for coach : " +coach);
		
		// retrieve bean from spring container
		Coach betaCoach = context.getBean("myBatmintonCoach", Coach.class);
		System.out.println("\n Memory location for betaCoach: " +betaCoach);
		
		boolean result = (coach == betaCoach);
		System.out.println("\n pointing to same object: " + result);
		
		System.out.println("Prototype scope");
		
		// close the context
		context.close();

	}
}
