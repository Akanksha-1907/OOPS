package Abstraction;

abstract class abstract_class    //incomplete class
{
	public void sellshare()
	{
		System.out.println("Sell the shares");
	}
	void buyshares()
	{
		System.out.println("Buy the shares");
	}
	abstract void buynsell();     //incomplete method
	
	//We cannot create object of abstract class.
}
