/**
 * 
 */
package com.springannotation.dependencyqualifiers;

import java.util.Random;

import org.springframework.stereotype.Component;

/**
 * @author Thara
 *@creation date & time: 5 Nov 2020 12:32:00 pm
 */
@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String data[] = {"cfdvgf","bvbc","oio"};
	
	//create an random number generator
	Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		String randomService = data[index];
		return randomService;
	}

}
