package Inheritance;

public class Kiwi_sub_hierarchical  extends fruit_super_hierarchical
{
	public void vitaminC()
	{
		System.out.println("Kiwi is rich in VitaminC");
	}
	public static void main(String[] args)
	{
		Kiwi_sub_hierarchical k=new Kiwi_sub_hierarchical();
		k.vitaminC();
		k.color("Green");
		k.taste("Sweet&Sour");
		
	}

}
