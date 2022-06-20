package Inheritance;

public class c1 extends p1
{
	public void square(int a)
	{
		System.out.println("Area of square- "+(a*a));
	}
	
	public static void main(String[] args) 
	{
		c1 obj=new c1();
		obj.trapezium(2,4,6);
		cylinder(9,2);
		obj.sphere(5);
		obj.square(4);
		
		
	}

}
