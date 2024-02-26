package returnnnn;

//WAP for Return keyword for float,string and boolean
import java.util.Scanner;

public class Assignment_107 {

	float add()
	{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the value of A");
	float a = s1.nextFloat();
	System.out.println("Enter the value of B");
	float b = s1.nextFloat();
	float sum = a+b;
	System.out.println("The sum of two numbers are:" + sum);
	return sum;
	}
	
    public static void main(String[] args) {  
    	Assignment_107 r =new Assignment_107();
    	r.add();
		
	}
    
}

