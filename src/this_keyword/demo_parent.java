package this_keyword;

public class demo_parent 
{
	int age=85;
	String name="Tom";
	
	public demo_parent()
	{
		int age=75;
		System.out.println(age);
	}
	public demo_parent(int a)
	{
		//this();
		System.out.println(a);
	}
	public void m1()
	{
		System.out.println(this.age);
		System.out.println(this.name);
	}
	public static void main(String[] args) 
	{
		demo_parent obj1=new demo_parent(40);
		demo_parent obj=new demo_parent();
		obj.m1();
		
	}

}
