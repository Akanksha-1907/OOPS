package Casting;

public class upcasting_child extends upcasting_parent   //Inheritance performed
	//money(),farm() and vehicles() methods are inherited

	//create property of subclass
{
	public void job()
	{
		System.out.println("Government");
	}
	//override the properties that are used and changed by the child class
	
	public void money()
	{
		System.out.println("Money= 45 Crore");
	}
	public void Farm()
	{
		System.out.println("Farm= 07 Acres");
	}
	public static void main(String[] args) 
	{
		upcasting_child obj=new upcasting_child();
		obj.job();
		obj.money();
		obj.Farm();
		obj.Vehicles();
		
		//performing upcasting
		//Syntax--->superclassname objectname=new superclassconstructor();
		System.out.println("***********");
		
		upcasting_parent obj1=new upcasting_child();
		obj1.Farm();
		obj1.money();
		obj1.Vehicles();    //we cannot call child class method here.
		
		//performing downcasting
		//Syntax--->subclassname objectname=(subclassname) upcastingobject;
		System.out.println("***********");
		
		upcasting_child obj2=(upcasting_child)obj;
		obj2.Farm();
		obj2.job();
		obj2.money();
		obj2.Vehicles();
		
		
		
	}
}
