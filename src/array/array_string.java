package array;

public class array_string 
{
	
	public static void main(String[] args) 
	{
		//Step 1--> Array Declaration
		
		String s []=new String[4];    //Index=0 1 2 3
		
		//Step 2-->Array Initialization
		
		s[0]="Piku";
		s[1]="Chiku";
		s[2]="Niku";
		s[3]="Tiku";
		
		//Step 3--> Array Usage of printing of array
		
		//using for loop
		
		for(int i=0;i<=3;i++)
		{
			System.out.println(s[i]);
		}
		
		//using foreach loop
		
		System.out.println();    //for breaking
		for(String i:s)
		{
			System.out.println(i);
		}
		
	}

}
