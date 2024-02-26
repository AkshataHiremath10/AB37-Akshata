package castingg;

//Upcasting and downcasting problem 5 as per diagram during class
class New1 {
	void Onee() {
		System.out.println("1");
	}

}

class New2 extends New1 {
	void Twoo() {
		System.out.println("2");
	}

}

class New3 extends New2 {
	void Threee() {
		System.out.println("3");
	}
}

public class Assignment_93 extends New3 {
	void Fourr() {
		System.out.println("4");
	}

	public static void main(String[] args) {
		New2 n1 = new New3(); // Upcasting
		n1.Onee();
		n1.Twoo();
		New3 n2 = new Assignment_93();
		Assignment_93 n3 = (Assignment_93) n2;
		n3.Fourr();

	}
}
