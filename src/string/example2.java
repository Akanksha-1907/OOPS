package string;

public class example2 
{
	public static void main(String[] args)
	{
		String s1="abc";
		String s2=new String("xyz");
		String s3="xyz";
		String s4="xyz";
		String s5=new String("xyz");
		
		s1.concat(s5);
		s1.concat("hij");
		s2.concat(s3);
		s1=s1.concat(s5);
		
		System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5);
		
		
		
		
	}

}
