package learnjava;

public class Assignment_10
{
	public static void add()
	{
		int a=30;
		int b=20;
		int add=a+b;
		System.out.println(add);			
	}
	public static void sub()
	{
		int a=30;
		int b=20;
		int sub=a-b;
		System.out.println(sub);
	}
    public void mul()
    {
    	int a=30;
    	int b=20;
    	int mul=a*b;
    	System.out.println(mul);
    }
    public void div()
    {
    	int a=30;
    	int b=20;
    	int div=a/b;
    	System.out.println(div);
    }
    public static void main(String[] args)
    {
	    System.out.println("call static method");	
	    add();
	    sub();
	    System.out.println("call non-static method");
	    Assignment_10 a1=new Assignment_10();
	    a1.mul();
	    a1.div();
	}
    
    
}
