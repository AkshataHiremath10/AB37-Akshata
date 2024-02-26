package static_nonstatic;
//WAP to create a non static method and call it inside the main method

public class Assignment_5 {

	public void mul() {
		int x = 50;
		int y = 5;
		int mul = x * y;
		System.out.println(mul);
	}

	public void div() {
		int x = 50;
		int y = 5;
		int div = x / y;
		System.out.println(div);
	}

	public static void main(String[] args) {

		System.out.println("call non-static method");
		Assignment_5 a1 = new Assignment_5();
		a1.mul();
		a1.div();
	}

}
