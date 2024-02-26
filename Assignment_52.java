package interfacee1;
/* Create child class and 2 interfaces and create relation with child class with 
  interface  1st and relation of child class with interface 2nd and achieve 
  multiple level inheritance */
interface First
{
void sub();
void mul();
}

interface Second
{

void add();
void div();
}

public class Assignment_52 implements First,Second
{
	public void add() 
	{
System.out.println("This is a add method");		
	}

	public void div() 
	{
		System.out.println("This is a div method");
	}

	public void sub() 
	{
		System.out.println("This is a sub method");
	}
	
	public void mul()
	{
		System.out.println("This is a mul method");
	}
public static void main(String args[])
{
	Assignment_52 a = new Assignment_52();
	a.add();
	a.div();
	a.sub();
	a.mul();
	}
}
