package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
//Create Array of String
	
	
	@Override
	public String getFortune() {
		//pink Random array from String
		String[] data = {
				"Beaware of wolf in Sheeps clothing",
				"Dilligance of mother is good",
				"Fundamentalist peope"
		};
		//Create Random Number Generator
		Random myRandom = new Random();
		int index=myRandom.nextInt(data.length);
		String theFortune=data[index];
		
		return theFortune;
	}

}
