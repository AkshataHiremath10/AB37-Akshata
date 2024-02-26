package scannerrrr;

import java.util.Scanner;
/* WAP by taking value of age from scanner class and if age is greater than or
   equal to 18 then print "i am adult else "i am young*/

public class Assignment_39 {
	Assignment_39() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = s.nextInt();
	
		if (age >= 18) {
			System.out.println("i am adult");
		} else {
			System.out.println("i am young");

		}
	}

	public static void main(String[] args) {
		{
			new Assignment_39();
		}

	}
}
