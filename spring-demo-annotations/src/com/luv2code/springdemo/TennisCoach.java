package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public  class TennisCoach implements Coach {
   @Autowired
   @Qualifier("randomFortuneService")
   
	private FortuneService fortuneService;
	//define default Constructor
	public TennisCoach() {
		System.out.println("TennisCoach>>Inside default Constructor doSomeCrazyStuff");
	}
	/*
	//define setter Method
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}*/
	
	/*@Autowired
	public TennisCoach(FortuneService thefortuneService)
	{
		fortuneService=thefortuneService;
	}*/
	
	@Override
	public String getDailyworkout() {

		return "Practise Your Backhand Volley + Cricket Daily";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	
}
