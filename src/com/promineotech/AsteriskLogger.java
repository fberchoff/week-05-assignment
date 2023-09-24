package com.promineotech;

public class AsteriskLogger implements Logger {

	/* This class implements the Logger interface.  It will print a given message using
	 * the asterisk as part of the formatting.  When the log method is invoked, the given
	 * message will print without being prefixed with the word, "Error".  However, when the error
	 * method is invoked, the given message will be presented as an "error" .
	 */
	
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
