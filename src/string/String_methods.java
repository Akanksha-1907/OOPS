package string;

public class String_methods 
{
	public static void main(String[] args) 
	{
		
	//Method 1-->length();-->use to find out the size of the string.
	String s1="Civil Engineering";
	System.out.println(s1.length());
	
	//Mehtod2-->equals();-->use to check the equality between two strings,it checks case and spell.
	String s2="Akanksha";
	String s3="akanksha";
	String s4="akanksha";
	String s5="Hedaoo";
	System.out.println(s2.equals(s3));  //it gives output in true and false.
	System.out.println(s3.equals(s4));
	System.out.println(s2.equals(s5));
	
	//Method 3-->equalsIgnoreCase();-->use to check the eu=quality between two strings but it do not consider case.
	String s6="Akanksha";
	String s7="akanksha";
	String s8="akanksha";
	String s9=" Hedaoo";
	System.out.println(s6.equalsIgnoreCase(s7));  //it gives output in true and false.
	System.out.println(s7.equalsIgnoreCase(s8));
	System.out.println(s6.equalsIgnoreCase(s9));
	
	//method 4-->charAt(index);-->give the  character which is present at that particular index.
	String s10="Sugar Cosmetics";
	//   index= 01234567891011121314
	System.out.println(s10.length());
	System.out.println(s10.charAt(14));
	
	//Method 5-->toUpperCase();-->use to convert all letters into UPPERCASE.
	String s11="Bobbie Brown";
	System.out.println(s11.toUpperCase());
	
	//Method 6-->toLowerrCase();-->use to convert all letters into lowercase.
	String s12="Butterfly Tampoline Park";
	System.out.println(s12.toLowerCase());
	
	////Method 7-->concat();-->use to concat/merge two strings.
	System.out.println(s6.concat(s9));
  }
}
