package Blocks;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Write a Program to handle below 2 Exceptions by using 2 catch blocks  */
public class Assignment_61 {
	Assignment_61() // constructor
	{
		System.out.println("we are using a try and catch block");
		try {
			Scanner input = new Scanner(System.in);
			//int a= input.nextInt();
			// System.out.println(a);
			//int c = 1/0;
			//System.out.println(c);
			boolean b = input.nextBoolean();
			System.out.println(b);

		} 
		catch (NullPointerException aa) {
			System.out.println("This is a NullPointerException "+ aa);
		}
		catch (ArithmeticException ae) {
			System.out.println("This is a ArithmeticException "+ ae);
		} catch (InputMismatchException ime) {
			System.out.println("This is a =InputMismatchException" + ime);
		} finally {
			System.out.println("This is a finally block");
		}
	}

	public static void main(String args[]) {

		new Assignment_61(); // calling constructor
	}
}
