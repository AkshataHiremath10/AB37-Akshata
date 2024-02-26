package arrayss;

/*
create and array of length 4 of integer data type and find out average of those
 number and remainder of those.
*/
public class Assignment_66 {

	static void average() // static method
	{
		int numbers[] = new int[5];
		numbers[0] = 16;
		numbers[1] = 17;
		numbers[2] = 18;
		numbers[3] = 19;
		numbers[4] = 20;
		int total = 0;
		for (int i = 0; i < numbers.length; i++) {

			total = total + numbers[i];
		}
		System.out.println("The total of given numbers are :- " + total);
		double average = (total / numbers.length);
		System.out.println("The average of numbers are :- " + average);

	}

	public static void main(String args[]) {
		average();

	}
}
