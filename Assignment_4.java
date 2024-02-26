package static_nonstatic;
//WAP to create many static method and call inside amain method

public class Assignment_4 {
	public static void add() {
		int a = 30;
		int b = 20;
		int add = a + b;
		System.out.println(add);
	}

	public static void sub() {
		int a = 30;
		int b = 20;
		int sub = a - b;
		System.out.println(sub);
	}

	public static void mul() {
		int a = 30;
		int b = 20;
		int mul = a * b;
		System.out.println(mul);
	}

	public static void div() {
		int a = 30;
		int b = 20;
		int div = a / b;
		System.out.println(div);
	}

	public static void main(String[] args) {
		System.out.println("call static method");
		add();
		sub();
		mul();
		div();

	}
}
