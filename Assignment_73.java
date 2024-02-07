package stringFunctionss;
/*WAP for below(You can take your name)String="My name is Akshata"
 output:M N I A. After printing this remove all the spaces from 
 the output and print it.*/

public class Assignment_73 {
	public static void main(String[] args) {
		String s = "My Name Is Akshata";
		System.out.println(s.replaceAll("[a-z]", ""));
		String s1= "M N I A";
		System.out.println(s1.replaceAll(" ",""));
	}

}
