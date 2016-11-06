package com.tractionpvt.greeting;

public class Main {

	public static void main(String[] args) {
		// Simple Greeting Service
		Greeting greeting = new GreetingService();
		System.out.println(greeting.greet("Traction"));
		
		// Fortune Greeting Service
		greeting = new FortuneService();
		System.out.println(greeting.greet("Jonathan"));
		
	}
	
}
