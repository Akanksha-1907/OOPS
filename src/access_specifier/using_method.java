package access_specifier;

public class using_method 
{
	private void m1()
	{
		System.out.println("Private method is getting called");
	}
	protected void m2()
	{
		System.out.println("Protected method is getting called");
	}
	void m3()
	{
		System.out.println("Default method is getting called ");
	}
	public void m4()
	{
		System.out.println("Public method is getting called");
	}
	public static void main(String[] args) 
	{
		using_method obj=new using_method();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		
	}
}
