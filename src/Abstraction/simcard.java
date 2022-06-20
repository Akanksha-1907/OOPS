package Abstraction;

abstract class simcard 
{
	//abstract method incomplete
	//abstraction can be achieved through abstract class 0% or 100%
	abstract void SMS();
	abstract void Calling();
	abstract void Internet();
	abstract void Subscription();
	
	//complete method ...so abstraction is achieved here.
	public void show()
	{
		System.out.println("Hello");
	}
	
	public void display()
	{
		System.out.println("Summer!");
	}
}
