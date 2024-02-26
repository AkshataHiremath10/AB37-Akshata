
package castingg;

/*WAP to find out the area of a circle for ten times.Take the pi value from Math.PI
   and take r value from math.random and solve this problem 10 times*/

   public class Assignment_94 {
	public static void main(String[] args) {
		double pi = Math.PI;
		double r = Math.random();
		double area = pi * r * r;

		System.out.println(area);
		for (double i = area; i <= 10; i++) {
			System.out.println(Math.random());
		}
	}
}
