package switchhh;
 /*Write a program using Switch(a) keyword case1:addition of b&c,
	case 2 : subtraction of b,c 
	case 3 : multiplication of b,c 
	case 4:  division of b,c 
	fetch the value of a,b,c from scanner class using nextint() method. and print the output individual for all cases
	*/

import java.util.Scanner;

public class Assignment_42 
	{
		
		public static void main(String args[])
		{
			System.out.println("If you want Addition of two given numbers press 1");
			System.out.println("If you want subtraction of two given numbers press 2");
			System.out.println("If you want multiplication of two given numbers press 3");
			System.out.println("If you want division of two given numbers press 4");
			Scanner s1 = new Scanner(System.in);
			System.out.println("press the number ");
			int a=s1.nextInt();		
			
		    Scanner s2= new Scanner(System.in);
		    System.out.println("Enter b value");
		    int b= s2.nextInt();
		    Scanner s3 = new Scanner(System.in);
		    System.out.println("Enter c value");
		    int c= s3.nextInt();
		    int result;
			switch(a)
			{
			
			case 1: //System.out.println("This is a addition"); 
				    result = b+c;
				    System.out.println("The additon of two given numbers is : "+ result);

		    break;
			
			case 2: //System.out.println("This is a Subtraction");
			           result =b-c;
			           System.out.println("The Subtraction of two given numbers is : "+result);

			break;
			case 3: //System.out.println("This is a multiplication");
				    result =b*c;
				    System.out.println("This Multiplication of two given numbers is :- "+result);
	
			break;
			case 4: //System.out.println("This is a division");
			         if(a>b)
			         {
			        	 result = a/b;
			        	 System.out.println("The division of two given numbers is : "+result);
			         }
			         else
			         {
			        	 result=b/a;
			        	 System.out.println("The division of two given numbers is :"+result);
			         }
				
			}
			
		}
		
	}
