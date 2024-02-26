package scannerrrr;
//WAP to get input mismatch exception using scanner class for all 
//the data types.

import java.util.Scanner;

public class Assignment_35 {
	//IIB
	{
	Scanner s= new Scanner(System.in);
	byte b=	s.nextByte();
		System.out.println("The defalut value of byte is :- "+b);
	short ss=s.nextShort();
	System.out.println("The default value of short is :- "+ss);
	int i= s.nextInt();
	System.out.println("The defalut value of int is :- "+i);
	long l= s.nextLong();
	  System.out.println("The defalut value of long is :- "+l);
	float f= s.nextFloat();
	System.out.println("The defalut value of float is :- "+f);
	double d= s.nextDouble();
	System.out.println("The defalut value of double is :- "+d);
	char c;
	System.out.println("");
	String st=s.next();
	System.out.println("The defalut value of byte is :- "+st);
	}

      public static void main(String args[])
       {
    	  
    	 new Assignment_35();
	
         
         }


}