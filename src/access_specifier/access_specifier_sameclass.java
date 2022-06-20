package access_specifier;

public class access_specifier_sameclass 
{
	//access specifiers within the same class
	
	private int a=10;
	protected int b=20;
	int c=30;				//default
	public int d=40;
	
	public void m1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		access_specifier_sameclass obj=new access_specifier_sameclass();
				obj.m1();
		
	}

}
