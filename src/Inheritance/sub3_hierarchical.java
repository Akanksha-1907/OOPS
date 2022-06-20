package Inheritance;

public class sub3_hierarchical extends super_hierarcical
{
	public void movieticket()
	{
		System.out.println("We can book movie ticket via paytm");
	}
	public static void main(String[] args) 
	{
		sub3_hierarchical obj=new sub3_hierarchical();
		obj.movieticket();
		obj.withUPI("Absent");
		obj.withwallet("Present");
		
	}

}
