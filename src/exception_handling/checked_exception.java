package exception_handling;

public class checked_exception 
{
	//example of checked exception handling
	//for checked exception we use'throws' keyword and write exeption in front of it.
	//If we know the exception name then we can write that name instead of exception but in case we don't know so universally exception should be written.
	
	public static void main(String[] args) throws Exception  //here instead of exception -->InerruptedException bcz we know name.
	{
		System.out.println("Hello there!");
		Thread.sleep(5000);         
		//This method gives time leap between the two sentences/web pages etc for the execution.ahere is two sentences.
		//here 5000 is the 5 second time leap between hello there and akanksha this side while executing.
		System.out.println("Akanksha this side.");
		
	}

}
