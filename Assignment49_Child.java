package interfacee1;
/*  Create a class and in this  create interface as amazon with login and logout methods also 
	 Create child class and create relation between them */
    interface Amazon
	{
	void login();
	void logout();
	}

	public class Assignment49_Child implements Amazon
	{
		{
			System.out.println("this is a IIB");
		}
		
		public static void main(String args[])
		{
			Assignment49_Child a49= new Assignment49_Child();
			a49.login();
			a49.logout();
		}

		public void login() 
		{
	System.out.println("this is a login method");
			
		}

		public void logout() 
		{
	System.out.println("this is a logout method");
			
		}
		
	}
