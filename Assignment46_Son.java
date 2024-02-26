package inheritance1;
/* Write a Program hierarchical inheritance  and create a three classes (son,daughter,
   parent) in a single program.*/

	class Parent
	{
		Parent() //this is a constructor
		{
			System.out.println("this is a parent constructor");
		}
	void add()
	{
	System.out.println("This is a add method");	
	}
	}
	class Daughter extends Parent
	{
	void sub()
	{
	System.out.println("This is a sub method");	
	}
	}

	public class Assignment46_Son extends Parent 
	{
		Assignment46_Son() //constructor 
		{
			System.out.println("This is a son constructor");
		}
		
	 void mul()
	 {
		 System.out.println("This is a mul method");
	 }

		
		
		public static void main(String args[])
		{
			Assignment46_Son a= new Assignment46_Son();
			
			a.add();
			a.mul();
			
		}
	}

