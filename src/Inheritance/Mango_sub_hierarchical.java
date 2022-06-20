package Inheritance;

public class Mango_sub_hierarchical extends fruit_super_hierarchical 
{
	public void vitaminC()
	{
		System.out.println("Mango contains Vitamin 'C'");
	}
	public static void main(String[] args) 
	{
		Mango_sub_hierarchical m=new Mango_sub_hierarchical();
		m.vitaminC();
		m.color("Yellow");
		m.taste("Sweet");
	
	}
}
