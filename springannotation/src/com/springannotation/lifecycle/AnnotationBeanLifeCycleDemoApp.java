/**
 * 
 */
package com.springannotation.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springannotation.lifecycle.Coach;

/**
 * @author Thara
 *@creation date & time: 6 Nov 2020 11:41:21 am
 */
public class AnnotationBeanLifeCycleDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//load spring config file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotationLifeCycle.xml");
				
				//get bean from spring container
				Coach coach = context.getBean("tennisCoachBeanLifeCycle", Coach.class);
				
				// call method on the bean
				System.out.println(coach.getDailyWorkout());
				
				//call new method for fortune service
				System.out.println(coach.getDailyFortuneService());
				
				System.out.println("*********Bean default scope:  both pre and predestroy method are executed*******");
				
				//close context
				context.close();
	}

}
