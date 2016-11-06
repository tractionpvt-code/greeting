package com.tractionpvt.greeting;

public class Main {

	public static void main(String[] args) {
		Greeting greeting = new GreetingService();
		System.out.println(greeting.greet("Traction"));
	}
	
}
