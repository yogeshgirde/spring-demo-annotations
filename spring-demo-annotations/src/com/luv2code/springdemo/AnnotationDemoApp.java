package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
  
		//Read spring config file
		ClassPathXmlApplicationContext ctx=
				 new ClassPathXmlApplicationContext("applicationContext.xml");
		//Get the Bean From Spring Container
		Coach theCoach= ctx.getBean("tennisCoach",Coach.class);
		
		//Call the Method on Bean
		System.out.println(theCoach.getDailyworkout());
		//Call the Method to get Daily Fortune
		System.out.println(theCoach.getDailyFortune());
		
		//Close the container
		ctx.close();
	
	}

}
