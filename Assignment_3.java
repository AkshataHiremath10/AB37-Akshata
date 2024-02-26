package static_nonstatic;
//WAP to create one static method and call inside a main method

public class Assignment_3 {
	public static void add() {
		int a = 30;
		int b = 20;
		int add = a + b;
		System.out.println(add);
	}

	public static void main(String[] args) {
		System.out.println("call static method");
		add();

	}

}
