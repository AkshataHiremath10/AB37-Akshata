package arrayss;

import java.util.Arrays;

/*
Create an array of length 4 and copy the value of another array by iteration
*/
public class Assignment_65 {

	void arrs() // non - static method
	{
		int number[] = new int[3];
		number[0] = 55;
		number[1] = 22;
		number[2] = 33;
		int num[] = new int[3];
		for (int i = 0; i < 3; i++) {
			num[i] = number[i];
		}
		System.out.println(Arrays.toString(num));

	}

	public static void main(String args[]) {
		Assignment_65 a = new Assignment_65();
		a.arrs();
	}

}
