package stringFunctionss;

import java.util.Arrays;

 
//WAP to check if 2 given strings are anagram of each other or not

public class Assingment_84 {
	public static void main(String[] args) {
		String a = "aniaml";
		String b = "malina";
		if (a.length() != b.length()) {
			System.out.println("Not an Anagram");
		} else {
			
			char[] c = a.toCharArray();
		    Arrays.sort(c);
		
		    System.out.println(Arrays.toString(c));
			char[] d = b.toCharArray();
			Arrays.sort(d);
			System.out.println(Arrays.toString(d));
			if(Arrays.equals(c, d)==true)
			{
				System.out.println("Anagram");
			}
			
		}

	}

}
