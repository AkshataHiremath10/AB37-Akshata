package stringFunctionss;
/*String =GroTechMinds 
 * output1=All capital letters in String a.
 * output2=All small letters in String b
 * and print both the Strings*/

public class Assignment_74 {
	public static void main(String[] args) {
		String a="GroTechMinds";
		System.out.println(a.replaceAll("[a-z]"," "));
		
		String b="GroTechMinds";
		System.out.println(b.replaceAll("[A-Z]",""));
		 
	}
}

