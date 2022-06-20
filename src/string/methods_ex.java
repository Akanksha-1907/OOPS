package string;

public class methods_ex 
{
	public static void main(String[] args) 
	{
		String s=" Ostrich5684168,Gir587 5affe,Lion,Tiger,54Onion,Potato,Daffodil";
		System.out.println(s.lastIndexOf("i"));
		System.out.println(s.lastIndexOf("Lion"));
		
		char[]a=s.toCharArray();
		for(char b:a)
		{
			System.out.print(" "+b);
		}
		String[]x=s.split("f");
		for(String y:x)
		{
			System.out.print(" \n"+y);
		}
		
		String s1=s.substring(9,17);
		System.out.print(s1);
		System.out.println();
		System.out.println(s.replace("o","z"));
		System.out.println(s.replaceFirst("t", "k"));
		
		System.out.println(s.replaceAll("[^0-9]", ""));
		
	}

}
