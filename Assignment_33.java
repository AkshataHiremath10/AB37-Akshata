package variabless;
/* WAP to find a area of a circle,keep pi as static global final,
create 2 methods 1 having r=7 and another having r=14.
*/

public class Assignment_33 {
	static final double pi = 3.14;

	void radius() {
		int r = 7;
		double area = pi * r*r;
		System.out.println(area);
	}

	void radius1() {
		int r1 = 14;
		double area1 = pi * r1*r1;
		System.out.println(area1);
	}

	public static void main(String[] args) {
		Assignment_33 a = new Assignment_33();
		System.out.println("Area of Circle 1");
		a.radius();
		System.out.println("Area of Circle 2");
		a.radius1();

	}
}
