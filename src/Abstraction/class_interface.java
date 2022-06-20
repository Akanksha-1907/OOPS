package Abstraction;

//implementation class
public class class_interface implements Interface    //implements is a keyword use to call interface in class.
{
	
   public void show()
   {
	System.out.println("Interface method is completed");
   }
   public static void main(String[] args) 
   {
	   class_interface c=new class_interface();
			  c.show();
			  System.out.println(c.a);
   }
}
