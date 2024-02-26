package interfacee1;
/* Create a child class and two interface (both having 2-2 abstract methods in it )
  and create relation between child class  and interface one and interface two*/
     interface One
	{
	    void add();
		void sub();
	}
	interface Two
	{
		void mul();
		void div();
	}
	public class Assignment_50 implements One,Two
	{
	static 
	{
	System.out.println("this is a SIB block");	
	}
	{
	System.out.println("this is a IIB block");	
	}

		public static void main(String args[])
		{
			Assignment_50 a = new Assignment_50();
			a.add();
			a.sub();
			a.div();
			a.mul();
		}
		public void mul() 
		{
		System.out.println("this is a multipication method");		
		}

		public void div() 
		{
		System.out.println("this is a division method");	
		}

		public void add() 
		{
		System.out.println("this is a add method");	
		}
		
		public void sub() 
		{
		System.out.println("this is a subtraction method");
		}
	}

