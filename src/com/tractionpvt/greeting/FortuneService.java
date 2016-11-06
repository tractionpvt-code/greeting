package com.tractionpvt.greeting;

import java.util.Random;

public class FortuneService implements Greeting {

	private String[] messages = { "Your Stars are gonna shine this week :)",
			"You need to take care of your health",
			"Its time to move on I guess :)", "Be little careful at work" };

	private Random random = new Random();
	
	@Override
	public String greet(String name) {
		return "Hi " + name +"," + messages[random.nextInt(messages.length)];
	}

}
