package access_specifier;

public class access_specifier1_diff_class 
{
	public void m2()
	{
		access_specifier_sameclass obj=new access_specifier_sameclass();
		//obj.m1();
		System.out.println(obj.b);     //we cannot call private in different class
		System.out.println(obj.c);
		System.out.println(obj.d);
	
	}
	public static void main(String[] args)
	{
		access_specifier1_diff_class obj1=new access_specifier1_diff_class();
		obj1.m2();
		
	}

}
