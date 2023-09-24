package com.promineotech;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("***" + message + "***");
		
	}

	@Override
	public void error(String message) {
		
		String longAsterisks = "*".repeat(message.length() + 13);
		
		System.out.println(longAsterisks);
		System.out.println("***" + "Error: " + message + "***");
		System.out.println(longAsterisks);			
		
	}

}
