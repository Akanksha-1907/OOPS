package access_specifier1;

import access_specifier.access_specifier_sameclass;

public class access_specifier_diff_pkg extends access_specifier_sameclass
{
	public void m3()
	{
		//access_specifier_diff_pkg obj=new access_specifier_diff_pkg();
		//System.out.println(obj.b);     we dont need to create the object bcz its inheritance
		//System.out.println(obj.d);
		
		//we cannot call private and default in different package.
		
		System.out.println(b);     //we can call protected in diff pkg if inheritance is there. 
		System.out.println(d);     //we can call public anywhere in the project or package.
	}
	public static void main(String[] args) 
	{
		access_specifier_diff_pkg obj1=new access_specifier_diff_pkg();
		obj1.m3();
		
	}

}
