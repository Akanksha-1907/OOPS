package Inheritance;

public class Locker extends cupboard
{
	public void footwear()
	{
		System.out.println("Keds");
	}
	public static void main(String[]args)
	{
		Locker obj=new Locker();
		obj.dress();
		jwellery();
		obj.footwear();
		
	}

}
