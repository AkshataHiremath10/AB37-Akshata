package static_nonstatic;
//WAP to create many non-statis method and call it inside the main method.

public class Assignment_6 {
	public void add() {
		int a = 30;
		int b = 20;
		int add = a + b;
		System.out.println(add);
	}

	public void sub() {
		int a = 30;
		int b = 20;
		int sub = a - b;
		System.out.println(sub);
	}

	public void mul() {
		int a = 30;
		int b = 20;
		int mul = a * b;
		System.out.println(mul);
	}

	public void div() {
		int a = 30;
		int b = 20;
		int div = a / b;
		System.out.println(div);
	}

	public static void main(String[] args) {
		System.out.println("call non-static method");
		Assignment_6 a1 = new Assignment_6();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
	}

}
