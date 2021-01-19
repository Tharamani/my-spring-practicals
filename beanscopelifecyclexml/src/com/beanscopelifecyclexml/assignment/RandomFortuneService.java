package com.beanscopelifecyclexml.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.beanscopelifecycle.specifications.FortuneService;

/**
 * @author Thara
 * @creation date & time: 3 Nov 2020 1:52:00 pm
 */
public class RandomFortuneService implements FortuneService {

	List<String> rFortuneList = new ArrayList<String>();

	public RandomFortuneService() {
		System.out.println("RandomFortuneService : inside no-args constructor");
		prepareFortunes();
	}

	@Override
	public String getFortune() {
		String randomElement = null;
		try {

			Random r = new Random();
			int randomitem = r.nextInt(rFortuneList.size());
			randomElement = rFortuneList.get(randomitem);
			return randomElement;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return randomElement;
	}

	public List<String> prepareFortunes() {

		if (rFortuneList.size() == 0) {
			rFortuneList.add("Well Played, do better next time!");
			rFortuneList.add("You all rocked it!");
			rFortuneList.add("Congrats,best match ever played!");

			System.out.println("RandomFortuneService : prepareFortunes() : " + rFortuneList.size());
			return rFortuneList;
		} else {
			System.out.println("RandomFortuneService : rFortuneList contains list of fortunes " + rFortuneList.size());
			return rFortuneList;
		}
	}

}
