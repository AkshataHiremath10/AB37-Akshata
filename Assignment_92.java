package castingg;

//Upcasting and downcasting problem 4 as per diagram during class 
class Upcasting3 {
	void Upcast3() {
		System.out.println("3");
	}

}

class Upcasting2 extends Upcasting3 {
	void Upcast2() {
		System.out.println("2");
	}

}

class Upcasting1 extends Upcasting2 {
	void Upcast1() {
		System.out.println("1");
	}
}

public class Assignment_92 extends Upcasting1 {
	void Upcast() {
		System.out.println("4");
	}

	public static void main(String[] args) {
		Upcasting2 u1 = new Assignment_92(); // Upcasting
		u1.Upcast2();
		u1.Upcast3();

		Assignment_92 u2 = (Assignment_92) u1; // Downcasting
		u2.Upcast1();
		u2.Upcast2();
		u2.Upcast3();

	}
}
