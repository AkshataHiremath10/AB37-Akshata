package interfacee1;
/* Create child class having relation with abstract class having relation with 
  interface(1) and interface (1) having relation with another interface (2)   */

interface One1 {
	void add();
}

interface Two2 extends One1 {
	void sub();
}

abstract class Xyz implements Two2 {
	abstract void mul();

	abstract void div();
}

public class Assignment_54 extends Xyz {

	public void sub() {
		System.out.println("This is a sub method");
	}

	public void add() {
		System.out.println("This is a add method");
	}

	public void div() {
		System.out.println("This is a div method");
	}

	void mul() {
		System.out.println("This is a mul method");
	}

	public static void main(String args[]) {
		Assignment_54 a = new Assignment_54();

		a.add();
		a.sub();
		a.mul();
		a.div();
	}
}
