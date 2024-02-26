package interfacee1;
/* Create 1 child class having main method ,Create 1 abstract class having 1 abstract 
   method and 1 concrete method and interface having abstract methods .
   Create relation between child class -> Abstract class-> interface */
interface world {
	void mul();

	void div();
}

abstract class abcd implements world {
	static {
		System.out.println("This is a SIB block in abstract class");
	}

	abstract void add();

	void sub() {
		System.out.println("This is a subtraction method");
	}
}

public class Assignment_51 extends abcd {
	public static void main(String args[]) {
		Assignment_51 a = new Assignment_51();
		a.add();
		a.sub();
		a.mul();
		a.div();
	}

	public void mul() {
		System.out.println("This is a multiplication method");
	}

	public void div() {
		System.out.println("This is division method");
	}

	void add() {
		System.out.println("This is a add method");
	}
}
