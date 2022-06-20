package exception_handling;

public class multiple_catch_blocks 
{
	//Multiple catch blocks ...if we are using multiple catch blocks then we have to gve specific exception name.
	
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Application Login");
		
		String s="Good Morning";
		int y[]= {10,56,41,328,75};
		int a=s.length();
		try
		{
			System.out.println(s.charAt(a));   //risky code
			y[5]=49;
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());  
			Thread.sleep(3000);
			e.printStackTrace();
			Thread.sleep(3000);
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException g)
		{
			g.printStackTrace();
		}
		finally
		{
			System.out.println("Logout from Application");
		}

	}
}
