package stringFunctionss;
//WAP take any alphanumeric string and check at which position there is numeric value

public class Assignment_80
{
	public static void main(String[] args)
	{
		String name = "Aksh123";
		char c1[] = name.toCharArray();
		for (int i = 0; i < name.length(); i++) 
		{
			boolean answer = Character.isDigit(c1[i]);

			if (answer == true) 
			{ 
				System.out.println("The index value of numeric value is:" + i);

			}

		}
	}
}
