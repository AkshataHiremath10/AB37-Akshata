package interfacee1;
/*
Create child class having relation with interface 3rd 
1st interface having relation with 2nd interface
2nd  interface having relation with 3rd interface 
*/
interface Firstt
{
	void mul();
}
interface Secondd extends Firstt
{
	void sub();
}
interface Thirdd extends Secondd
{
	void add();
}

public class Assignment_56 implements Thirdd
{

	public static void main(String args[])
	{
	 Assignment_56 a = new Assignment_56();	
     a.add();
     a.sub();
     a.mul();
	}
	public void sub()
	{	
System.out.println("This is a sub method");		
	}
	public void mul()
	{	
		System.out.println("This is a mul method");
	}
	
	public void add() 
	{	
		System.out.println("This is a add method");
	}
}
