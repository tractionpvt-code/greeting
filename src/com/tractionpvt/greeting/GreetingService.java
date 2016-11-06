package com.tractionpvt.greeting;

public class GreetingService implements Greeting {

	@Override
	public String greet(String name) {
		return "Hello," + name;
	}
	
}
