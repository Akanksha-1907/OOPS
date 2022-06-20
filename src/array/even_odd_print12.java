package array;

public class even_odd_print12 
{
	
	public static void main(String[]args)
	{
	int a[]={25,14,02,94,35,74,19,13,73,78,94};
	int even=0;
	int odd=0;
	System.out.println("Odd numbers- ");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2!=0)
		{
			System.out.println(a[i]);
			System.out.println();
			
		}
	}
	System.out.println("Even Numbers- ");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			System.out.println(a[i]);
			System.out.println();
		}
		
	}

	}
}
