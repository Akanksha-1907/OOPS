package polymorphism;

public class main_method_overloading 
{
	
	//  Main method can be Overloaded
	public void main()
	{
		System.out.println("Main Method without Arguments");
	}
	public static void main(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		main_method_overloading obj=new main_method_overloading();
		obj.main();
		main(20);
		
	}

}
