package scannerrrr;
//WAP by using all the methods of scanner class.

import java.util.Scanner;

public class Assignment_34 { 
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter integer Number");
		int a = s.nextInt();
		System.out.println(a);
		
		System.out.println("Enter String Value");
		String s1 = s.next();
		System.out.println(s1);
		
		System.out.println("Enter short Value");
		short s2 = s.nextShort();
		System.out.println(s2);
		
		System.out.println("Enter byte Value");
		byte b = s.nextByte();
		System.out.println(b);
		
		System.out.println("Enter long Value");
		long l = s.nextLong();
		System.out.println(l);
		
		System.out.println("Enter double Value");
		double d = s.nextDouble();
		System.out.println(d);
		
		System.out.println("Enter float Value");
		float f = s.nextFloat();
		System.out.println(f);
		
		System.out.println("Enter boolean Value");
		boolean b1 = s.nextBoolean();
		System.out.println(b1);
	}

}
