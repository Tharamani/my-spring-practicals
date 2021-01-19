/**
 * 
 */
package com.springannotation.dependencyqualifiers;

import org.springframework.stereotype.Component;

/**
 * @author Thara
 *@creation date & time: 5 Nov 2020 12:32:47 pm
 */
@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Database Fortune Service";
	}

}
