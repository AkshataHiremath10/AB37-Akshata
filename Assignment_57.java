package accessspecify;
/*
Create a class with four different methods other than main method with different access specifiers and try to access them with in the class  
*/ 


public class Assignment_57 
{

	public  void add()
	 {
	System.out.println("This method with Public Access specifier");	 
	 }
	private void sub()
	 {
		System.out.println("This method with Private Access specifier");
	 }
	protected void mul()
	{
		System.out.println("This method with protected Access specifier");
	}
  void div()
	{
  	System.out.println("This method with default or package Access specifier");
	}
	public static void main(String args[])
	{
		Assignment_57 a = new Assignment_57();
		a.add();
		a.sub();
		a.mul();
		a.div();
		
		
	}
}
