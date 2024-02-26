package arrayss;
/*Create an array of length 4 of int data type.
 * Find out 41 is present or not in Array.Print message in both the cases*/

public class Assignment_75 {
	public static void main(String[] args) {
		int array[]= {20,30,40,50};
		int temp=0;
		int search =41;
		for (int i=0;i<=3;i++)
		{
			if(search ==array[i])
			{
				System.out.println("Number is present at index" +array[i]);
				
				temp++;
			
			}
		}
		if(temp==0)
		{
			System.out.println("Number is not found in an array");
		}
	}
	

	
	
	
	
}
