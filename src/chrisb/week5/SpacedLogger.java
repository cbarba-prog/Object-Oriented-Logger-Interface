package chrisb.week5;

/*
3.	Create two classes that implement the Logger interface
	a.	AsteriskLogger
	b.	SpacedLogger
*/

public class SpacedLogger implements Logger {

	/*
	6.	The SpacedLogger should add spaces between each character 
		of the String argument passed into its methods.
	
	7.	If the log method received “Hello” as an argument, it should print H e l l o
	*/
	
	@Override
	public void Log(String log) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i<log.length(); i++)
		{
			System.out.print(log.charAt(i) + " ");
		}
		System.out.println();
	}

	/*
	8.	The error method should do the same, but with “ERROR:” preceding the spaced 
		out input (i.e. ERROR: H e l l o)
	*/
	
	@Override
	public void Error(String error) {
		// TODO Auto-generated method stub
		
		System.out.print("ERROR: ");
		
		for (int i = 0; i<error.length(); i++) {
			System.out.print(error.charAt(i) + " ");
			
		}
		System.out.println();
	}
	
}