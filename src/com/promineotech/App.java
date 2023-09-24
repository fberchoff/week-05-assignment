package com.promineotech;

public class App {

	public static void main(String[] args) {
		
		/* Let's create an instance of both the AsteriskLogger logger and the SpacedLogger logger.
		   Both of these classes are implementations of the Logger interface */
		
		Logger AsteriskTest = new AsteriskLogger();
		Logger SpaceTest = new SpacedLogger();
		
		
		/* Let's now send a message using the AsteriskLogger log method.  This will send the
		   message using asterisks as part of the formatting and without it looking like
		   an "error" */
		
		AsteriskTest.log("This is a test of the asterisk log method");
		
		System.out.println();
		
		
		/* Let's now send a message using the AsteriskLogger error method.  This will send the
		   message using asterisks as part of the formatting and present the message as
		   an "error" */
		
		AsteriskTest.error("This is a test of the asterisk error method");
		
		System.out.println("\n");
		
		
		/* Let's now send a message using the SpacedLogger log method.  This will send the
		   message using spaces as part of the formatting and without it looking like
		   an "error" */
		
		SpaceTest.log("Testing the space log method");
		
		System.out.println();
		
		
		/* Let's now send a message using the SpacedLogger error method.  This will send the
		   message using spaces as part of the formatting and present the message as
		   an "error" */
		
		SpaceTest.error("Testing the space error method");

	}

}
