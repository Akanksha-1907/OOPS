package array;

public class reverse_array 
{
	//Program to print array in reverse order
	public static void main(String[] args) 
	{
		int[] arr= {85,45,21,20,45,630,78,96,75,45,26,28,19,07,46,025,78,94,658};
		for(int i=0;i<arr.length;i++)   //we have to give index value here i.e.size of array-1
		{
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		System.out.println("Reversed Array");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i] +" ");
		}
	}

}
