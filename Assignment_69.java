package stringFunctionss;

/*
Write a program to add two words in the form of zigzag manner
*/
public class Assignment_69 {

	static void zigzag() // static method
	{
		String p1 = "MOM";
		String p2 = "DAD";
		String str=p1.concat(p2);
		System.out.println(str);
		System.out.println("The zigzag manner of MOM DAD is :- ");
		for (int i = 0; i < 3; i++) {
			char sum = p1.charAt(i);
			char sum1 = p2.charAt(i);
			System.out.print(sum + "" + sum1);
		}
	}

	public static void main(String args[]) {
		zigzag();
	}

}
