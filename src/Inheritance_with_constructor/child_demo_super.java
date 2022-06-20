package Inheritance_with_constructor;

public class child_demo_super extends parent_demo_super 
{
	public child_demo_super()
	{
		super(" Panipuri");
		System.out.println("hello");
		
	}
	
	public child_demo_super(int c)
	{
		super("Then let us eat Panipuri");
		System.out.println("Banarasi Pan " + c);
	}

	public child_demo_super(String s) 
	{
		super(45, 5200.75f);
		System.out.println("Kahi ke Pan banaras wala- " + s);

	}

	public static void main(String[] args) 
	{
		child_demo_super obj2=new child_demo_super();
		child_demo_super obj1 = new child_demo_super(5);
		child_demo_super obj = new child_demo_super("Banarasi babu");

	}
}
