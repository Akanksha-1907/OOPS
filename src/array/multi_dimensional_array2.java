package array;

public class multi_dimensional_array2 
{
	public static void main(String[] args) 
	{
		String s[][]=new String[3][3];
		
		s[0][0]="A";
		s[0][1]="B";
		s[0][2]="C";
		s[1][0]="D";
		s[1][1]="E";
		s[1][2]="F";
		s[2][0]="G";
		s[2][1]="H";
		s[2][2]="I";
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(s[i][j] +" ");
			}
		}
	}

}
