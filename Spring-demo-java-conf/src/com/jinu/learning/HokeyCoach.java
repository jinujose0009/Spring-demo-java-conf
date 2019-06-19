package com.jinu.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HokeyCoach implements Coach {

	private FortuneService fortuneService;
	@Autowired
	@Value("${foo.email}")
	private String email;
	@Autowired
	@Value("${foo.location}")
	private String location;
	
	
	public String getEmail() {
		return email;
	}

	public String getLocation() {
		return location;
	}

	public HokeyCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "Daily practive  30 min";
	}

	@Override
	public String getDailyfortuneservice() {
		// TODO Auto-generated method stub
		return fortuneService.getFortunes();
	}

}
