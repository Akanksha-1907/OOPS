package array;

public class multi_dimensional_array 
{
	public static void main(String[] args) 
	{
		//step 1-->Array declaration
		int[][] arr= new int[2][3];   //[2]=row & [3]=column
		
		//Step 2--> Array Initialization
		
		arr[0][0]=10;    //row index =0 and 1 & column index =0,1,2.
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		
		System.out.println(arr.length);   //it gives the row value
		
		//Using for loop
		for(int i=0;i<=1;i++)   //outer for loop for rows...index value is taken.
		{
			for(int j=0;j<=2;j++)    //inner for loop for columns   
				//firstly it will execute inner loop and after the condition is false it will go to outer loop.
			{
				System.out.print(arr[i][j] +" ");
			}
		}
		
	}

}
