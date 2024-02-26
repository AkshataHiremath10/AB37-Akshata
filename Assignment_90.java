package castingg;

//Upcasting and downcasting problem 2 as per diagram during class
class txt1 {
	void typing() {
		System.out.println("Hiiii");
	}
}

class txt2 extends txt1 {
	void datafetching() {
		System.out.println("Hello");
	}
}

public class Assignment_90 extends txt2 {

	void login() {
		System.out.println("I am login");
	}

	public static void main(String[] args) {
		txt1 t = new Assignment_90();      //upcasting
		t.typing();
		Assignment_90 t1 = (Assignment_90) t;  //down casting
		t1.datafetching();
		t1.login();
		t1.typing();

	}
}