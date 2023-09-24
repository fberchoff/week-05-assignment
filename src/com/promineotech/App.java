package com.promineotech;

public class App {

	public static void main(String[] args) {
		
		Logger AsteriskTest = new AsteriskLogger();
		Logger SpaceTest = new SpacedLogger();
		
		AsteriskTest.log("This is a test of the asterisk log method");
		
		System.out.println();
		
		AsteriskTest.error("This is a test of the asterisk error method");
		
		System.out.println("\n");
		
		SpaceTest.log("Testing the space log method");
		
		System.out.println();
		
		SpaceTest.error("Testing the space error method");

	}

}
