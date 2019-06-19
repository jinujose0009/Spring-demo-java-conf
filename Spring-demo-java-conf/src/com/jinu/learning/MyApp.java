package com.jinu.learning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(sportsConfig.class);
		HokeyCoach thecoach= context.getBean("hokeyCoach",HokeyCoach.class);
		System.out.println(thecoach.getDailyworkout());
		System.out.println(thecoach.getDailyfortuneservice());
		System.out.println(thecoach.getEmail());
		System.out.println(thecoach.getLocation());
		context.close();

	}

}
