package exception_handling;

public class methods_toprint_info_about_exception 
{
	//Methods to print information about exception
	public static void main(String[] args) 
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
			//Method 1-->
			System.out.println(e.getMessage());  //Output-->String index out of range: 12
			//gives description of Exception
			
			//Method 2-->
			e.printStackTrace();
			
			//Method 3-->
			System.out.println(e);
		}
		finally
		{
			System.out.println("logout from Application");
		}
	}

}
