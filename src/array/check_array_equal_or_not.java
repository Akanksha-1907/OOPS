package array;

import java.util.Arrays;

public class check_array_equal_or_not
{
	//java program to check two arrays are equal or not
	public static void main(String[] args) 
	{
		
		int [] arr1= {12,78,96,74,52,63,41,20,37};
		int [] arr2= {12,78,96,74,52,63,41,20,37};
		int [] arr3= {72,78,78,74,10,63,95,20,19};
		
		//using method() Arrays.equals(args1,args2)
		
		System.out.println(Arrays.equals(arr1, arr2));  //True
		System.out.println(Arrays.equals(arr1, arr3));  //False
		System.out.println(Arrays.equals(arr2, arr3));  //false
	}

}
