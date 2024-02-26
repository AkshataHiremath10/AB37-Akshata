package arrayss;
/*
Create an array of length of 5 of integer data type and fetch its value from the y7
scanner class
*/

import java.util.Scanner;

public class Assignment_63 {
	Assignment_63() // constructor
	{
		int ary[] = new int[10];
		ary[0] = 0;
		ary[1] = 11;
		ary[2] = 22;
		ary[3] = 333;
		ary[4] = 4444;
		ary[5] = 55555;
		ary[6] = 666666;
		ary[7] = 7777777;
		ary[8] = 88888888;
		ary[9] = 999999999;
		System.out.println("Enter o to 9 for finding the values");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println(ary[a]);

	}

	public static void main(String args[]) {
		new Assignment_63(); // calling constructor
	}

}
