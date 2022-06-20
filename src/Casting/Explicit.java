package Casting;

public class Explicit 
{
	
	//Higher datatype converted into lower datatype
	public static void main(String[] args) 
	{
		double d=94.65;
		System.out.println(d);
		
		int i=(int)d;
		System.out.println(i);  //here we lost 0.65 of data
	}

}
