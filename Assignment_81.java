package stringFunctionss;
//WAP to find out number of characters and numbers of digits in below string Aksh1224

public class Assignment_81 {
	public static void main(String[] args) {
		String str="Aksh1224";
		char c[]=str.toCharArray();
		int countOfNum=0;
		int countOfChar=0;
		 for(int i=0;i<=str.length()-1;i++)
		 {
			 boolean ans=Character.isDigit(c[i]);
			 if(ans==true)
			 {
				countOfNum++;      //no of Numbers
			 }
			 else {
				 countOfChar++;     //no of Character
				 
			 }
		}
		 System.out.println("The no of digit="+countOfNum);
		 
		 System.out.println("The no of char="+countOfChar);
	}

}
