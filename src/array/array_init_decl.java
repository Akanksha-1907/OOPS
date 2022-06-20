package array;

public class array_init_decl 
{
	//Combine Array Initialization and Declaration
	public static void main(String[] args) 
	{
		//Method 1--->Using new keyword
		
		int arr[]=new int[] {10,20,30,40,50};    //it directly gives the index value..we do not have to write it.

		//Method 2--->Using literals
		
		String str[]= {"Chintu","Pintu","Mintu"};
		
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		System.out.println();
		
		for(String s:str)
		{
			System.out.println(s);
		}
}
}