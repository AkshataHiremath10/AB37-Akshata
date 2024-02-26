package sib_iib;
//WAP with combination of SIB,IIB,main method and constructor

public class Assignment_15 {
	Assignment_15() {

		System.out.println("I am constructor");
	}

	static {
		System.out.println("call me SIB");
	}
	{
		{
			System.out.println("call me IIB");
		}
	}

	public static void main(String[] args) {
		new Assignment_15();
		System.out.println("Main method");

	}

}
