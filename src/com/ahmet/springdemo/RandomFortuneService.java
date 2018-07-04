package com.ahmet.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = {
			"xyz", "abc", "def"
	};
	
	private Random myRandom = new Random();
 	
	@Override
	public String getFortune() {
		
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		
		return theFortune;
	}

}
