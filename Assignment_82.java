package stringFunctionss;

//WAP to reverse a string and print it
public class Assignment_82 {
	public static void main(String[] args) {
		String input = "Akshata";
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			char reverse = input.charAt(i);
			
	     output = output + reverse;
		}
		System.out.println(output);
	}

}
