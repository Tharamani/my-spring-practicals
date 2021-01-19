/**
 * 
 */
package com.springannotation.dependencyqualifiers;

import org.springframework.stereotype.Component;

/**
 * @author Thara
 *@creation date & time: 5 Nov 2020 12:33:24 pm
 */
@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Rest fortune service";
	}

}
