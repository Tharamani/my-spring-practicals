/**
 * 
 */
package com.springAOP.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springAOP.config.ConfigAOP;
import com.springAOP.service.TrafficFortuneService;

/**
 * @author Thara
 * @creation date & time: 7 Dec 2020 11:03:19 pm
 */
public class AroundDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				ConfigAOP.class);

		// get the bean from spring container
		TrafficFortuneService trafficFortuneSerive = annotationConfigApplicationContext.getBean("trafficFortuneService", TrafficFortuneService.class);

		System.out.println("AroundDemo : main appp calling fortune service...." );
		
		String fortune = trafficFortuneSerive.getFortune();
		
		System.out.println("AroundDemo : main appp fortune data is...." + fortune);
		System.out.println("Finished...");
		// close the context
		annotationConfigApplicationContext.close();
	}

}
