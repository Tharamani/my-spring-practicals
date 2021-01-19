/**
 * 
 */
package com.springannotation.assignment.activity6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import com.springannotation.assignment.activity7.FortuneService;

/**
 * @author Thara
 * @creation date & time: 7 Nov 2020 1:07:20 pm
 */
@Component
public class FileBasedFortuneService implements FortuneService {

	private BufferedReader bio = null;
	List<String> listFortunes;

	// create a random number generator
	private Random myRandom = new Random();

	/**
	 * 
	 */
	public FileBasedFortuneService() {
		System.out.println("FileBasedFortuneService: inside no-args constructor");
	}

	/**
	 * 
	 */
	@PostConstruct
	private void doSomeStartupStuff() {

		System.out.println("FileBasedFortuneService: inside doSomeStartupStuff");

		try {
			bio = new BufferedReader(new FileReader(
					"C:/Users/vishu/Documents/Thara//UdelerCourse/workspace/springassignmentsactivities/src/readFortune.txt"));
			String fortune;
			listFortunes = new ArrayList<String>();
			while ((fortune = bio.readLine()) != null) {
				listFortunes.add(fortune);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(listFortunes.size());
		String strFortune = listFortunes.get(index);
		return strFortune;
	}

	/**
	 * 
	 */
	@PreDestroy
	private void doCleaningStuff() {
		System.out.println("FileBasedFortuneService: inside doCleaningStuff");
		try {
			System.out.println("FileBasedFortuneService: inside doCleaningStuff closing the resourse");
			bio.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
