package scannerrrr;
import java.util.Scanner;
/* WAP to do addition,subtraction,multiplication,division by using scanner class 
   and a and b as local variables.*/

public class Assignment_36 {
	void add() {
		System.out.println("This is a  addition:");
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of A");
		int a = s1.nextInt();
		System.out.println("Enter the value of B");
		int b = s1.nextInt();
		int sum = a + b;
		System.out.println("The sum of two numbers are:" + sum);
	}

	void sub() {
		System.out.println("                          ");
		System.out.println("This is a subtraction");
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the value of A");
		int a = s2.nextInt();
		System.out.println("Enter the value of B");
		int b = s2.nextInt();
		int subtraction = a - b;
		System.out.println("The subtraction of given two nunbers are:" + subtraction);
	}

	void mul() {
		System.out.println("                   ");
		System.out.println("This is a multiplication");
		Scanner s3 = new Scanner(System.in);
		System.out.println("Enter the value of A");
		int a = s3.nextInt();
		System.out.println("Enter the value of B");
		int b = s3.nextInt();
		int multiplication = a * b;
		System.out.println("The multiplication of two given numbers are:" + multiplication);
	}

	void div() {
		System.out.println("                        ");
		System.out.println("This is a division");
		Scanner s4 = new Scanner(System.in);
		System.out.println("Enter the value A");
		int a = s4.nextInt();
		System.out.println("Ente8ir the value of B");
		int b = s4.nextInt();
		int division = a / b;
		System.out.println("The division of given two numbers are:" + division);
	}

	public static void main(String[] args) {
		Assignment_36 a36 = new Assignment_36();
		a36.add();
		a36.sub();
		a36.mul();
		a36.div();
	}

}
