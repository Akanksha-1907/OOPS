package Inheritance;

public class sub1_hierarchical extends super_hierarcical 
{
	public void cylinder()
	{
		System.out.println("We can book cylinder via Gpay");
	}
      public static void main(String[] args)
      {
    	  sub1_hierarchical obj=new sub1_hierarchical();
    	  obj.cylinder();
    	  obj.withUPI("Present");
    	  obj.withwallet("Absent");
		
	}
}
