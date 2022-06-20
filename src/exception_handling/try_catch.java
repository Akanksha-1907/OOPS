package exception_handling;

public class try_catch
{
	//try_catch block for handling exception
	
	public static void main(String[] args) 
	{
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		try
		{
			System.out.println(50/0); //here it stops execution of program.
		}
		catch(ArithmeticException ae)     //we can write Exception only instead ArithmeticException.
		{
			System.out.println("We cannot divde a number by zero.");
		}
		
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		
	}

}
