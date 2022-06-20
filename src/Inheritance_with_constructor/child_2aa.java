package Inheritance_with_constructor;

public class child_2aa extends parent_2a
{
	public child_2aa()
	{
	
	System.out.println("Subclass constructor called");
	}
	
	//if we have 2 or more than 2 constructors present in super class ..and for calling those constructors in this sub class we have to use 'super();' keyword.
	//if we do not use super keyword then by default it will call only constructor which is without parameters.
	
	
	public child_2aa(int x)			//constructor with parameters from the previous class i.e. super class..to call it in this sub class.
	{
		super(30);
		System.out.println("Subclass Constructor with parameters."+x);
	}

	
	public static void main(String[] args) 
	{
		child_2aa obj=new child_2aa();    //object of constructor without parameters
		
		child_2aa obj1=new child_2aa(20);  //object of constructor with parameters
	}


}
