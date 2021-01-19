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
 *@creation date & time: 15 Dec 2020 7:00:44 pm
 */
@Aspect
@Component
@Order(1)
public class MyCloudAsyncAspect {
	@Before("com.springAOP.springaoppointcutorderaspects.MyAopExpressions.forDaoPackageNogetterAndSetter()")
	public void logToCloudAsync() {
		System.out.println();
		System.out.println(getClass() + "==============>>>>>> logToCloudAsync()");
	}
}
