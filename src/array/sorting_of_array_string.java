package array;

import java.util.Arrays;

public class sorting_of_array_string 
{
	public static void main(String[] args)
	{
		
	String a[]= {"Giraffe","Monkey","Goat","Camel","Buffalo","Cow","Donkey","Lion","Tiger","Hyena","Leopard","Fox","Zebra","Hippopotamus","Rhinosorous"};
	System.out.println();
	System.out.println("Original array");
	for(String s:a)
	{
		System.out.print(s +"/ ");
	}
		
	//Sorting in ascending order
	
	System.out.println();
	System.out.println("Sorted Array in ascending order");
	Arrays.sort(a);
	for(int i=0;i<a.length;i++)      //can also do -->for(String s:a)
	{
		System.out.print(a[i] +" /");
	}
	
	//Sorting in descending order
	
	System.out.println();
	System.out.println("Sorted Array in ascending order");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]+" /");
	}
	

}
}
