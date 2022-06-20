package polymorphism;

public class ride_sub extends ride_super
{
	public static void add(int p,int q,int r)
	{
		//super.add(2,2,5);        //we cannot override static method
		int y=p*q*r;
		System.out.println("Multiplication of Numbers- "+y);
		}
	public static void main(String[] args)
		{
			add(2, 2, 3);
			
			ride_super.start();
			ride_super.add(2, 74, 2);   //calling non-static method but we cannot override it.
			
			
		}
}
