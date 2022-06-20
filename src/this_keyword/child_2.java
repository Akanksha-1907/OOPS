package this_keyword;

public class child_2 extends parent_2
{
	int a=50;
	public child_2()
	{
		System.out.println("Child class get called");
	}
	public void m1()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
	public static void main(String[] args) 
	{
		child_2 obj=new child_2();
		obj.m1();
	}
		
	
}
