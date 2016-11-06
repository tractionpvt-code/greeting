package com.tractionpvt.greeting;

public class Main {

	public static void main(String[] args) {
		
		Greeting greeting = null;
		int selection = 0;
		switch(selection) {
			case 1:
				// Simple Greeting Service
				greeting = new GreetingService();
				System.out.println(greeting.greet("Traction"));		
				break;
			case 2:
				// Fortune Greeting Service
				greeting = new FortuneService();
				System.out.println(greeting.greet("Jonathan"));		
				break;
			default:
				throw new IllegalArgumentException("Must be a valid Selection");
		}
		
	}
	
}
