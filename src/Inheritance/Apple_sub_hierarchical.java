package Inheritance;

public class Apple_sub_hierarchical extends fruit_super_hierarchical
{
public void Fiber()
{
	System.out.println("Apple is rich in Fiber");
}
public static void main(String[] args) 
{
	Apple_sub_hierarchical a=new Apple_sub_hierarchical();
	a.Fiber();
	a.color("Red");
	a.taste("Sweet&Tart");
	
}
}
