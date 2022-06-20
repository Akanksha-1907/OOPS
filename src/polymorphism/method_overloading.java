package polymorphism;

public class method_overloading 
{
	
	//creating m1() method with different sets of arguments.
	//Method Overloading-->different methods with same name but different sets of arguments in same class or inherited class.
	
	public void m1()
	{
		System.out.println("Non-static method");
	}
	public void m1(int a)
	{
		System.out.println(a); 
	}
	public void m1(int a,String s)
	{
		System.out.println(a);
		System.out.println(s);
	}
	
	public static void main(String[] args) 
	{
		method_overloading obj=new method_overloading();
		obj.m1();
		obj.m1(45);
		obj.m1(75, "Age");
		
	}

}
