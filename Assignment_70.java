package stringFunctionss;

/*
Write a program to print a sentence in reverse order sentence is "my name is Akshata*/
public class Assignment_70 {

	static void reverse_of_sentence() // static method
	{
		String input = "My name is Akshata";
		

		System.out.println("The length of a sentance is :- " + input.length());
		System.out.println("The reverse of the sentence is :-");

		for (int i = input.length()-1; i >= 0; i--) {
			char reverse = input.charAt(i);
			System.out.print(reverse);
		}
	}

	public static void main(String args[]) {
		reverse_of_sentence();

	}
}
