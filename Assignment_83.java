package stringFunctionss;

import java.util.Scanner;

//WAP to check if the string is Palindrome
public class Assignment_83 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the word");
		String input = s.next();

		// String input = "GADAG";
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			char reverse = input.charAt(i);
			output = output + reverse;
 
		}
		System.out.println(output);

		{
			if (input.equals(output)) {
				System.out.println("Given word is palindrome");
			} else {
				System.out.println("Given word is not palindrome");
			}

		}
	}
}
