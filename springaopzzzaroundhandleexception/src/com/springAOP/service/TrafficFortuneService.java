/**
 * 
 */
package com.springAOP.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

/**
 * @author Thara
 * @creation date & time: 17 Dec 2020 8:17:23 am
 */
@Component
public class TrafficFortuneService {

	public String getFortune() {

		// simulate a delay
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// return a fortune
		return "expected heavy traffic this morning";
	}

	/**
	 * @param tripWire
	 * @return
	 */
	public String getFortune(boolean tripWire) {
		
		if(tripWire) {
			throw new RuntimeException("Major accident! highway is closed!");
		}
		return getFortune();
	}
}
