package Blocks;
import java.util.*;
/*
Write a program by using "throw" keyword 
if the age of a person is greater than 18 then allow him to access google web_site
 else throw an Arithmetic exception   */
public class Assignment_62 
{

	void check_the_age() throws ArithmeticException
	{
		System.out.println("Enter your age");
		Scanner s= new Scanner(System.in);
		int number = s.nextInt();
		if(number>18)
		{
			System.out.println("you are allow to use google web site");
		}
		else
		{
		throw new ArithmeticException();
	    }
    }
	
	public static void main(String args[])
	{
		Assignment_62 a =new Assignment_62();
		a.check_the_age();
	}
	
}
