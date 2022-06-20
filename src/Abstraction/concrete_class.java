package Abstraction;

public class concrete_class extends abstract_class
{
		void buynsell()
		{
	System.out.println("Implementing Stocks");
		}
		public static void main(String[] args) 
		{
			concrete_class obj=new concrete_class();
			obj.buynsell();
			obj.buyshares();
			obj.sellshare();
	
		}
}
