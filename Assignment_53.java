package interfacee1;
/* Create child class and 4 interfaces and create relation of child class with interface
  1st and relation of child class with interface 2nd and achieve multiple level
   inheritance */
interface Once
{
void add();	
}
interface 	Twice
{
	void sub();
}
interface Three
{
	void mul();
}
interface Four
{
	void div();
}
public class Assignment_53 implements Once,Twice,Three,Four
{
	public static void main(String args[])
	{
		Assignment_53 a =  new Assignment_53();
		a.add();
		a.sub();
		a.mul();
		a.div();
	}

	public void div() 
	{	
	System.out.println("This is a div method");
	}
	public void mul() 
	{
		System.out.println("This is a mul method");
	}
	public void sub() 
	{
		System.out.println("This is a sub method");
	}
	public void add() 
	{
	System.out.println("This is a add method");	
	}
	
}
