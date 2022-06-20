package exception_handling;

public class try_finally 
{
	//try_finally block
	
	public static void main(String[] args) 
	{
		String a="abc";
		try 
		{
			System.out.println(a.charAt(3));   //risky code
		}
		finally
		{
			System.out.println("Logout from Application");
		}
		System.out.println("Hello");
	}
	//If the catch block is not written i.e. if we not handled the exception then it do not print the remaining part.
	
}
