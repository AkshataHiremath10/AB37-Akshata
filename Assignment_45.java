package inheritance1;

/* Write a program for Multi level inheritance in a single program and make them
	  all the methods are non static */

	class First {
		void add() {
			System.out.println("This is a addition block");
		}
	}

	class Second extends First {
		void sub() {
			System.out.println("This is a subtraction block");
		}

	}

	class Third extends Second {
		void mul() {
			System.out.println("this is a multiplication block");
		}
	}

	class Fourth extends Third {
		void div() {
			System.out.println("This is a division block");
		}
	}
	public class Assignment_45 extends Fourth//child class
	{

		public static void main(String args[])
		{
			Assignment_45 a45= new Assignment_45();
			a45.add();
			a45.sub();
			a45.mul();
			a45.div();
		}
		
	}

