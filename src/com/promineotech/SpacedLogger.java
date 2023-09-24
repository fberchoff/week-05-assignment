package com.promineotech;

public class SpacedLogger implements Logger {

	/* This class implements the Logger interface.  It will print a given message using
	 * the the space character as part of the formatting.  When the log method is invoked, 
	 * the given message will print without the prefix of the word, "ERROR".  However, when 
	 * the error method is invoked, the given message will be presented as an "error" .
	 */
	
	@Override
	public void log(String message) {
		System.out.println(message.replace("", " ").trim());
		
	}

	@Override
	public void error(String message) {
		System.out.println("ERROR: " + message.replace("", " ").trim());
		
	}

}
