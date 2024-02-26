package sib_iib;
//WAP with 4 constructor and 1 IIB

public class Assignment_17 {
	Assignment_17() {

		System.out.println("I am constructor");
	}

	Assignment_17(int a) {
		System.out.println("call me First");
	}

	Assignment_17(int a, int b) {
		System.out.println("call me Second ");
	}

	Assignment_17(double a, int b) {
		System.out.println("call me Third ");
	}

	{
		System.out.println("call me IIB");
	}

	public static void main(String[] args) {
		new Assignment_17();
		new Assignment_17(10);
		new Assignment_17(10, 20);
		new Assignment_17(10.1, 30);
		new Assignment_17();

	}
}
