package learnjava;

public class Assignment3 
{
	public static void method1(int a)
	{
		System.out.println(a);
	}
    public static void method2(double a)
    { 
    	System.out.println(a);
    }
    public void method3(char a)
    {
    	System.out.println(a);
    }
    public void method4(boolean a)
    {
    	System.out.println(a);
    }
    public void method5(String a)
    {
    System.out.println(a);	
    }
    public static void main(String[] args)
    {
		System.out.println("call static method");
		method1(50);
		method2(50.51);
		System.out.println("call non-static method");
		Assignment3 a1=new Assignment3();
		a1.method3('A');
		a1.method4(false);
		a1.method5("Seeta");
	}
}
