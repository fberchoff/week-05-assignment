package com.promineotech;

public class SpacedLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println(message.replace("", " ").trim());
		
	}

	@Override
	public void error(String message) {
		System.out.println("ERROR: " + message.replace("", " ").trim());
		
	}

}
