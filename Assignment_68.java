package stringFunctionss;

/*
Write a program to add two words with the help of String functions and print the word 
vertically.
*/
public class Assignment_68 {
	public static void main(String args[])
	{
	//static void vertical() {
		String w1 = "Coding";
		String w2 = " Testing";
		String add = w1.concat(w2);
		System.out.println(add);
		for (int i = 0; i < add.length(); i++) {
			System.out.println(add.charAt(i));
		}
	}

	//public static void main(String args[]) {
	//	vertical();
	//}
}
