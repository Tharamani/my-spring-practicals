/**
 * 
 */
package com.springnoxml.InjectingProperty;

/**
 * @author Thara
 *@creation date & time: 4 Nov 2020 7:14:44 pm
 */
public class SadFortuneService implements FortuneService {

	/**
	 * 
	 */
	public SadFortuneService() {
		System.out.println("SadFortuneService: no-args constructor");
	}
	
	@Override
	public String getFortune() {
		return "Today is a sad day!";
	}

}
