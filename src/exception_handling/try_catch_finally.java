package exception_handling;

public class try_catch_finally 
{
	//try_catch_finally block
	
	public static void main(String[] args) 
	{
		int [] a= {19,85,45,03,75,96};
		try
		{
			a[6]=41; //ArrayIndexOutOfBoundsException
		}
		catch(Exception e)
		{
			System.out.println("Cannot add value at runtime");
		}
		finally
		{
			System.out.println("Logout from Application");
		}
		System.out.println("Hello");
		
	}

}
