package polymorphism;

public class sub_method_overriding extends super_method_overriding
{
	public void add(int h,int i)
	{
		super.add(5, 9);    //calling superclass method i.e int a and int b
		int j=h*i;
		System.out.println("Multiplication of numbers- "+j);
	}
	public static void main(String[] args)
	{
		sub_method_overriding obj=new sub_method_overriding();
		obj.add(2, 3);           //int h and int i is calling.
		
	}

}
