package get_set;

/*WAP to update the value of private variable username="abc@grotechmind.com" 
  to something else using getter and setter */

class Amazon {
	private String username = "abc@grotechmind.com";

	public String getUsername() // Getter method
	{
		return username;
	}

	public void setUsername(String username) // Setter method
	{
		this.username = username;
	}

}

public class Assignment_95 {
	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.setUsername("Aksh@gmail.com");
		System.out.println(a.getUsername());
	}

}
