package exception_handling;

public class checked_unchecked
{
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Application Login");
		
		String s="Good Morning";
		int a=s.length();
		try
		{
			System.out.println(s.charAt(a));   //risky code
		}
		catch(Exception e)
		{
			
			System.out.println(e.getMessage());  
			Thread.sleep(3000);
			e.printStackTrace();
			Thread.sleep(3000);
			System.out.println(e);
		}
		finally
		{
			System.out.println("logout from Application");
		}
	}


}
