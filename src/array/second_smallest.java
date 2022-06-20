package array;

import java.util.Arrays;

public class second_smallest
{

	public static void main(String[]args)
	{
	int arr[]={14,52,78,63,74,20,19,35,06,94};
	Arrays.sort(arr);
	for(int a:arr)
	{
	System.out.println(a);
	}
	int secondsmallest=arr[arr.length-8];
	System.out.println();
	System.out.println("secondsmallest- "+secondsmallest);
	}
	}





