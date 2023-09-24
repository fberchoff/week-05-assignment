package com.promineotech;

public interface Logger {

	/* The Logger interface has two methods.  The first method (log) will print out
	 * a message that is given to it.  The way the message is printed will differ
	 * depending on which class is used.
	 * 
	 * The second method (error) will print out a message that is given to it as an error.
	 * The way the "error" is presented will differ depending on which class is used.
	 */
	
	public void log(String message);
	
	public void error(String message);
	
}
