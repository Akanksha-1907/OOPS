package string;

public class String_methods1 
{
	public static void main(String[] args)
	{
		//Method 8-->trim();
		String str=" Welcome Home ";
		System.out.println(str);
		System.out.println(str.trim());
		
		//Method 9-->contains();
		String str1="Welcome to Greenland!Greenland me aapka swagat hai.";
		System.out.println(str1.contains("Greenland"));
		System.out.println(str1.contains("Evening"));
		
		//Method 10-->startsWith();
		System.out.println(str1.startsWith("Welcome"));
		System.out.println(str1.startsWith(" Welcome"));
		
		//Method 11-->endsWith();
		System.out.println(str1.endsWith("hai."));
		System.out.println(str1.endsWith("haina"));
		
		//Method 12-->isEmpty();
		String str2="";
		String str3=" ";
		String str4="Akanksha";
		System.out.println(str2.isEmpty());
		System.out.println(str3.isEmpty());
		System.out.println(str4.isEmpty());
	
		//Method 13-->indexOf();
		String str5="Ashu, Smriti, Sanku, Vyanku, Baku, Loki";
		System.out.println(str5.indexOf("a"));//It considers comma and whitespaces and it conts from beginning.
		System.out.println(str5.indexOf("Baku"));   //It gives index of B here i.e. the start of the word.
		
		//Method 14-->lastIndexOf();
		System.out.println(str5.lastIndexOf('k'));  //It gives index from last.
		System.out.println(str5.lastIndexOf("Vyanku"));  //It gives first letter index.
		
		//Method 15-->toCharArray();
		
		char[] arr=str5.toCharArray();
		for(char a:arr)
		{
			System.out.print(a+" ");
		}
		
		//Method 16-->split();
		String str6="Ashu, Smriti, Sanku, Vyanku, Baku, Loki";
		String[]s=str6.split(" ");//we can take any value from where we cant to split.here we split from whitespace.
		for(String a:s)
		{
			System.out.println("\n "+a);
		}
		
		//Method 17-->substring();
		String str7="Welcome to Greenland!Greenland me aapka swagat hai.";
		String s1= str7.substring(21);   //here we have to give index.
		System.out.println(s1);
		
		//Method 18-->replace();
		String w="hgsyjatsfks nbvdghcyfgd 6d8g4b65ffdgs 24df5v4s6g";
		String x=w.replace("g","p");     //here replace g with p.
		System.out.println(x);
		
		//Method 19-->replaceFirst();
		String y=w.replaceFirst("g", "o");   //replace only one alphabet.
		System.out.println(y);
		
	}

}
