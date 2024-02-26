package returnnnn;
//WAP for Return keyword for int and double datatype

public class Assignment_106 {
	int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	double subtract(int a, double b) {
		double sub = a - b;
		return sub;
	}

	public static void main(String[] args) {

		Assignment_106 r = new Assignment_106();
		System.out.println(r.add(10, 20));
		System.out.println(r.subtract(100, 9.65));

	}

}
