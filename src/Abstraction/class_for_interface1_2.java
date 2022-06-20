package Abstraction;

public class class_for_interface1_2 implements interface1,interface2
{
	public void m1()
	{
		System.out.println("M1 method is calling from interface1");
	}
	public void m2() 
	{
		System.out.println("M2 method is calling from interface1");
	}

	public void m3()
	{
		System.out.println("M3 method is calling from interface2");
	}

	public void m4()
	{
		System.out.println("M4 method is calling from interface2");
	}
	public static void main(String[] args) 
	{
		class_for_interface1_2 obj=new class_for_interface1_2();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		
	}
}
