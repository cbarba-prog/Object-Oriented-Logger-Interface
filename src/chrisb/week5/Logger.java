package chrisb.week5;

/*
 1.	Create an interface named Logger. 
 */

public interface Logger {

	/*
	2.	Add two void methods to the Logger interface, each should take a String as an argument
		a.	Log
		b.	Error
	*/
	
	public void Log(String log);
	
	public void Error(String error);
}
