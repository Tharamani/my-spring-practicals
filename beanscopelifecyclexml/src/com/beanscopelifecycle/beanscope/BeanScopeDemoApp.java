/**
 * 
 */
package com.beanscopelifecycle.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beanscopelifecycle.specifications.Coach;

/**
 * @author Thara
 *@creation date & time: 3 Nov 2020 5:23:14 pm
 */
public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
				
				//get bean from spring container where scope = singleton(default scope) 
				Coach coach = context.getBean("myCoach", Coach.class);
				Coach alphaCoach = context.getBean("myCoach", Coach.class);
				
				//check if they are referring to same bean
				boolean result = (coach==alphaCoach);
				System.out.println("\n pointing to same object: " + result);
				
				System.out.println("\n memory location for coach: " + coach);
				
				System.out.println("\n memory location for alphaCoach: " + alphaCoach);
				
				//close context
				context.close();
	}
}
