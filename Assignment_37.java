package scannerrrr;
/*WAP to do addition,subtraction,multiplication,division by using 
   scanner class and a and b as global variables.*/

import java.util.Scanner;

public class Assignment_37 {
	Scanner s1 = new Scanner(System.in);
	int a = s1.nextInt();
	int b = s1.nextInt();

	void add() {
		System.out.println("This is a addition");
		int sum = a + b;
		System.out.println("The sum of two given numbers are:" + sum);

	}

	void sub() {
		System.out.println("             ");
		System.out.println("This is a subtraction");
		int subtraction = a - b;
		System.out.println("The subtraction of two given numbers are:" + subtraction);
	}

	void mul() {
		System.out.println("                           ");
		System.out.println("This is a multiplication");
		int multiplication = a * b;
		System.out.println("The muktiplication of two given numbers are:" + multiplication);
	}

	void div() {
		System.out.println("                   ");
		System.out.println("This is a division");
		int division = a / b;
		System.out.println("The sum of two given numbers are:" + division);
	}

	public static void main(String[] args) {

		Assignment_37 s = new Assignment_37();
		s.add();
		s.sub();
		s.mul();
		s.div();
	}
}
