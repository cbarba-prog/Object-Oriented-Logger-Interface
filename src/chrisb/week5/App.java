package chrisb.week5;

/*
  		9.	Create a class named App that has a main method.
 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 	10.	In this class instantiate an instance of each of your logger classes that implement the Logger interface.
		*/
			Logger asteriskLogger = new AsteriskLogger();
			Logger spacedLogger = new SpacedLogger();	
			
			asteriskLogger.Log("Hello");
			asteriskLogger.Error("Hello");
			spacedLogger.Log("Hello");
			spacedLogger.Error("Hello");		
			
			System.out.println();
			
			/*
			  	11.	Test both methods on both instances, passing in Strings of your choice.
			 */
			
			asteriskLogger.Log("This is a sentence.");
			asteriskLogger.Error("This is a sentence.");
			spacedLogger.Log("This is a sentence.");
			spacedLogger.Error("This is a sentence.");		
			
		}

}
