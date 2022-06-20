package string;

public class pallindrome 
{
	public static void main(String[] args) 
	{
		String s1="NITIN";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println("Original String- "+s1);
		System.out.println("Reverse String- "+rev);
		if(s1.equalsIgnoreCase(rev))
		{
			System.out.println("String is Pallindrome");
		}
		else
		{
			System.out.println("String is not Pallindrome");
		}
	}

}
