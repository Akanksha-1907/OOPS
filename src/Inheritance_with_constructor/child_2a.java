package Inheritance_with_constructor;

public class child_2a extends parent_2a
{
	
	public child_2a()
	{
	System.out.println("Subclass constructor called");
	}
	
	//if we have 2 or more than 2 constructors present in super class ..and for calling those constructors in this sub class we have to use 'super();' keyword.
	//if we do not use super keyword then by default it will call only constructor which is without parameters.
	
	
	public static void main(String[] args) 
	{
		child_2a obj=new child_2a();    //object of constructor without parameters
		
		
	}
}
