package switchhh;
/*WAP using Switch(a) keyword case 1:addition, case 2:subtraction, case 3:multiplication, 
   case 4:division and fetch the value of 'a'with scanner class using next int(). */

import java.util.Scanner;
//Write a program using switch(a) keyword 
//case 1 addition
//case 2 subtraction
//case 3 multiplication
//case 4 division
//and fetch the value of a with scanner class using int() method
public class Assignment_41 //main class
{

	Assignment_41()//constructor
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		switch(a)
		   {
		case 1: System.out.println("Addition");
		break;
		case 2: System.out.println("Subtraction");
		break;
		case 3: System.out.println("Multiplication");
		break;
		case 4: System.out.println("Division");
		    }
		}
	
	
	public static void main(String args[])
	{
		new Assignment_41();
	}
	
}
