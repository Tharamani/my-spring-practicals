/**
 * 
 */
package com.springAOP.demo;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springAOP.config.ConfigAOP;
import com.springAOP.service.TrafficFortuneService;

/**
 * @author Thara
 * @creation date & time: 7 Dec 2020 11:03:19 pm
 */
public class AroundHandleExceptionDemo {

	private static Logger myLogger = Logger.getLogger(AroundHandleExceptionDemo.class.getName());
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				ConfigAOP.class);

		// get the bean from spring container
		TrafficFortuneService trafficFortuneSerive = annotationConfigApplicationContext.getBean("trafficFortuneService", TrafficFortuneService.class);

		myLogger.info("AroundDemo : main appp...." );
		
		myLogger.info("calling fortune service...." );
		
		boolean tripWire = true;
		String fortune = trafficFortuneSerive.getFortune(tripWire);
		
		myLogger.info("AroundDemo : main appp fortune data is...." + fortune);
		myLogger.info("Finished...");
		// close the context
		annotationConfigApplicationContext.close();
	}

}
