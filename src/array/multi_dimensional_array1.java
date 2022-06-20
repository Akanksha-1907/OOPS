package array;

public class multi_dimensional_array1
{
	public static void main(String[] args)
	{
		int [][] a=new int [3][3];  // row index=0,1,2 & column index =0,1,2
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		a[2][0]=7;
		a[2][1]=8;
		a[2][2]=9;
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(a[i][j] +" ");
			}
		}
		
	}

}
