package variabless;
/* WAP to calculate the area of circle.
(pi value should be final static local variable and initialize).*/

public class Assignment_30 {

	static void areaofcircle() {
		final double pi = 3.14;
		int r = 6;
		double area = pi * r*r;
		System.out.println(area);
	}

	public static void main(String[] args) {
		areaofcircle();

	}

}
