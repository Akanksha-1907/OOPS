package polymorphism;

public class sample1 
{
	public void m1()		//method declaration--->stored in heap area
	{
		System.out.println("Non-static method");  //method definition--->stored in method area
	}
	
	public static void main(String[] args) 
	{
		sample1 obj=new sample1();
		obj.m1();			//binding of method declaration and definition.
		
	}

}
