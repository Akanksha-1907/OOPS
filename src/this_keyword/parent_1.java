package this_keyword;

public class parent_1 
{
	int age=78;
	String name="Ikea";			//global variables
	
	public parent_1()
	{
		System.out.println("Parent class constructor getting called.");
	}
	
	public parent_1(String S)
	{
		this();
		System.out.println(S);

	}
	public void m1()
	{
		int a=80;				//local variable
		System.out.println(a);
		System.out.println(age);  //global variable called
		System.out.println(this.name);  //global variable called
		
	}
}
