package inheritance1;
	
/* Write a program for single level inheritance  where gk method (Child) is static and 
   parent (Selenium and java) are non static */


	class Program_2 //parent class
	{
		
	 void selenium()
	    {
		 System.out.println("This is a selenium method");
	     }
	void java()
	    {
		System.out.println("This is a java method");
		}
	}


	public class Assignment_44 extends Program_2//child class
	{

		static void gk()
		{
			System.out.println("This is a gk method");
		}
	
		
		public static void main(String args[])
		{
			Assignment_44 a = new  Assignment_44();
			a.java();
			gk();
			a.selenium();
		}
		
		
	}
