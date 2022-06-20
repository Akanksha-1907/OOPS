package Abstraction;

public class airtel extends simcard
{
	void SMS()
	{
		System.out.println("150 sms/day");
	}
	void Calling()
	{
		System.out.println("Unlimited");
	}
	void Internet()
	{
		System.out.println("3GB/day");
	}
	void Subscription()
	{
		System.out.println("Hotstar and Voot Free Subscription");
	}
	
	public static void main(String[] args) 
	{
		jio j=new jio();
		j.Calling();
		j.Internet();
		j.SMS();
		j.Subscription();
		System.out.println("********");
		
		idea i=new idea();
		i.Calling();
		i.Internet();
		i.SMS();
		i.Subscription();
		System.out.println("********");
		
		airtel a=new airtel();
		a.Calling();
		a.Internet();
		a.SMS();
		a.Subscription();
		
		
		
				
		
	}

}
