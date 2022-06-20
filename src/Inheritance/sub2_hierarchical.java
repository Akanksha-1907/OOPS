package Inheritance;

public class sub2_hierarchical extends super_hierarcical
{
	public void digitalgold()
	{
		System.out.println("We can book digital gold via Phonepe");
	}
   public static void main(String[] args)
   {
	   sub2_hierarchical obj=new sub2_hierarchical();
	   obj.digitalgold();
	   obj.withUPI("Present");
	   obj.withwallet("Present");
	
}
}
