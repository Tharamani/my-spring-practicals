/**
 * 
 */
package com.springAOP.springaoppointcutorderaspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Thara
 *@creation date & time: 15 Dec 2020 6:59:52 pm
 */
@Aspect
@Component
@Order(3)
public class MyApiAnalyticsAspects {

	//apply incluse package ...excluse getter and setter pointcuts to advice
		@Before("com.springAOP.springaoppointcutorderaspects.MyAopExpressions.forDaoPackageNogetterAndSetter()")
		public void performApiAnalytics() {
			System.out.println();
			System.out.println(getClass() + "==============>>>>>> performApiAnalytics()");
		}
}
