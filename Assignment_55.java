package interfacee1;
/* Create child class having relation with abstract class that abstract class having
    relation with interface (1) and interface(1) having relation with another
    interface(2)*/
interface One11 {
	void add();
}

interface Two22 extends One11 {
	void sub();
}

abstract class Wxyz implements Two22 {
	abstract void mul();

	abstract void div();
}
public class Assignment_55 extends Wxyz {
	public static void main(String args[]) {
		Assignment_55 a55 = new Assignment_55();
		a55.add();
		a55.sub();
		a55.mul();
		a55.div();
	}

	public void sub() {
		System.out.println("This is a sub method");
	}

	public void add() {
		System.out.println("This is a add method");
	}

	void mul() {
		System.out.println("This is a mul method");
	}

	void div() {
		System.out.println("This is a div method");
	}
}
