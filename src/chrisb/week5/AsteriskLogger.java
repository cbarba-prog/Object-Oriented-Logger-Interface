package chrisb.week5;

/*
3.	Create two classes that implement the Logger interface
	a.	AsteriskLogger
	b.	SpacedLogger
*/

public class AsteriskLogger implements Logger {

	/*
	4.	The log method on the AsteriskLogger should print out the String it receives between 
		3 asterisks on either side of the String (e.g. if the String passed in is “Hello”, 
		then it should print ***Hello*** to the console).
	*/
	
	@Override
	public void Log(String log) {
		// TODO Auto-generated method stub
		System.out.println("***" + log + "***");
	}

	/*
	 5.	The error method on the AsteriskLogger should print the String it receives inside a 
	 	box of asterisks, with the String preceded by the word “ERROR:”. For example, if “Hello” 
	 	is the argument, the following should be printed: 
	 	****************
	 	***Error: Hello***
	 	****************
	 */
	
	@Override
	public void Error(String error) {
		// TODO Auto-generated method stub
		
		String astCount = "";
		
		for (int i=0; i<error.length(); i++) {
			astCount += "*";
		}
			
		System.out.println("**********" + astCount + "***");
		System.out.println("***Error: " + error + "***");
		System.out.println("**********" + astCount + "***");

	}
	
}