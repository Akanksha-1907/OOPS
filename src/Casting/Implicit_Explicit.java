package Casting;

public class Implicit_Explicit 
{
	public static void main(String[] args) {
		
	
	int a=20;
	double b=95.63;
	
	//Implicit Casting
	
	double sum=a+b;
	System.out.println(sum);
	
	//Explicit Casting
	
	int add=a+(int)b;
	System.out.println(add);
	

}
}
