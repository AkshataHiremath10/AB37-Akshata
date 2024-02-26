package inheritance1;

public class Assignment47_Daughter extends Assignment47_Parent
{
	
	void daughter()
	{
		System.out.println("this is a daughter method");
	}
	Assignment47_Daughter() // this is a constructor
	{
		System.out.println("this is a daughter constructor");
	}
	public static void main(String args[])
   {
		Assignment47_Daughter a47 =new Assignment47_Daughter();
		a47.add();
		a47.sub();
		a47.mul();
		a47.div();
		a47.daughter();
	}
	
}

