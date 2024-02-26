package scannerrrr;
import java.util.Scanner;
/*Write a program to find a area of triangle by taking values of b (base) and
h (height) from scanner class*/

public class Assignment_38 //main class
{ 

	void area_of_triangle() //method with non static and non parameter
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the value of base");
		int base=s1.nextInt();
		System.out.println("Enter the value of height");
		int height= s1.nextInt();
		int areaoftriangle = (((base*height)/2));
		System.out.println(" ");
		System.out.println("The Area of triangle is : "+areaoftriangle);
	}
	
	public static void main(String args[])//main method
	{
		Assignment_38 s = new Assignment_38();
		s.area_of_triangle();
		
	}
	
}

