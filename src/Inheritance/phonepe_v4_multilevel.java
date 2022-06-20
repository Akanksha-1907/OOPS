package Inheritance;

public class phonepe_v4_multilevel extends phonepe_v3_multilevel
{
	public void ticketbooking()
	{
		System.out.println("Ticket booking in Version 4");
	}
	
	public static void main(String[] args) 
	{
		phonepe_v4_multilevel obj=new phonepe_v4_multilevel();
		obj.moneytransfer();
		obj.recharge();
		obj.loan();
		obj.ticketbooking();
		
	}
}
