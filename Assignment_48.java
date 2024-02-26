package inheritance1;

/* create a class and create two concrete methods inside a class(Static add,non static
  sub) create abstract class and create a abstract methods (Multiplication, division) 
  create two concrete methods inside main method */
abstract class Abc
{
abstract void multiplication();
abstract void division();
}

public class Assignment_48 extends Abc
{

	static void add()
	{
		System.out.println("this is a add method");
	}
	void sub()
	{
		System.out.println("this is a sub method");
	}
	
	void multiplication()
	{
	System.out.println("this is a multiplication method");	
	}
	
	void division() 
	{
		System.out.println("this is a division method");	
	}
	
	static
	{
		System.out.println("This is a SIB method");
	}
	{
		System.out.println("this is a IIB method");
	}
	public static void main(String args[])
	{
		Assignment_48 a = new Assignment_48();
	add();
	a.sub();
	a.multiplication();
	a.division();
	
	}
	}

