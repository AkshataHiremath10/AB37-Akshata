package inheritance1;


public class Assignment47_Son extends Assignment47_Parent 
 {
	
void son()
{
System.out.println("this is a son method");
}
Assignment47_Son() //this is a constructor
{
System.out.println("This is a son construcor");	
}
	
	public static void main(String[] args) 
	{
		Assignment47_Son a47 = new Assignment47_Son();
		a47.add();
		a47.sub();
		a47.mul();
		a47.div();
		a47.son();

	}

 }
