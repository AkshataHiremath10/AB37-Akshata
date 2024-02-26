package constructorr;
//WAP to create few constructor and call it inside main method.

public class Assignment_8 {

	Assignment_8()
	{
		System.out.println("Hello World");
	}
	Assignment_8(int a)
	{
		System.out.println("i am back");
	}
	Assignment_8(int a,double b)
	{
		System.out.println("print me");
	}
	public static void main(String[] args) {
		new Assignment_8();
		new Assignment_8(10);
		Assignment_8 a=new Assignment_8(5,10.10);
	}
}

