
package arrayss;

import java.util.Arrays;

/*
Create an array of length 3 having String data type and print it without sorting .
now sort the array and print it value after sorting 
use toString function to print the array
*/
public class Assignment_64 
{

	Assignment_64() //constructor
	{
		String ar[]= new String[3];
		ar[0]="HI";
		ar[1]="happy";
		ar[2]="christmas";
	for(int i=0;i<ar.length;i++)
	{
		System.out.println(ar[i]);
		
	} 
       System.out.println( Arrays.toString(ar));
	     Arrays.sort(ar);
	   System.out.println(Arrays.toString(ar));

	int rno[] = new int[3];
	rno[0]=900;
	rno[1]=2000;
	rno[2]=100;
	Arrays.sort(rno);
	System.out.println(Arrays.toString(rno));
	}
	
	public static void main(String args[])
	{
		new Assignment_64(); //calling constructor
		
	}
	
	
}
