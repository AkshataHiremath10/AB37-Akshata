package inheritance1;

/*
 Write a program for single level inheritance in a single program 
 and make all methods non static (selenium,java,gk) by creating object in child class */

class Program
{

	void selenium()
	{
		System.out.println("This is a selenium method");
	}
	void java()
	{
		System.out.println("This is a java method");
	}
	void gk()
	{
		System.out.println("This is a gk method");
	}
}


public class Assignment_43 extends Program
{

	public static void main(String args[]) 
	{
		Assignment_43 a = new Assignment_43();
		a.selenium();
		a.java();
		a.gk();
		
	}
	
}
