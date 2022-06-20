package Inheritance_with_constructor;

public class child_2_super extends parent_2_super
{
	public child_2_super()
	{
		super();
	}
	
	public child_2_super(int a)
	{
		super(a);
	}
	
	public child_2_super(int a,int b)
	{
		super(a,b);
	}
	
	public child_2_super(int c,float j)
	{
		super(c,j);
	}
	public static void main(String[] args)
	{
		child_2_super obj=new child_2_super();
		child_2_super  obj1=new child_2_super(20);
		child_2_super  obj2=new child_2_super(20,40);
		child_2_super  obj3=new child_2_super(75,52.36f);
		
		
		
	}
}
