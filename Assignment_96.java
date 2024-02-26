package get_set;
//Encapsulation program for int,char,string,double,float and boolean
class Allow {
	private int number = 3;
    public int getNumber() {
		return number;
	}
    public void setNumber(int number) {
		this.number = number;
	}
	private char var='a';
	public char getVar() {
		return var;
	}
    public void setVar(char var) {
		this.var = var;
	}
	private double number1 = 10.255;
    public double getNumber1() {
		return number1;
	}
    public void setNumber1(double number1) {
		this.number1 = number1;
	}

	private float number2 = 10.7f;
    public float getNumber2() {
		return number2;
	}
     public void setNumber2(float number2) {
		this.number2 = number2;
	}

	private boolean b = true;
    public boolean isB() {
		return b;
	}
   public void setB(boolean b) {
		this.b = b;
	}
}
   public class Assignment_96 {
	public static void main(String[] args) {
		Allow a = new Allow();
		a.setNumber(5);
		System.out.println(a.getNumber());
		a.setVar('v');
		System.out.println(a.getVar());
		a.setNumber1(10.366);
		System.out.println(a.getNumber1());
		a.setNumber2(22.1f);
		System.out.println(a.getNumber2());
		a.setB(false);
		System.out.println(a.isB());
	}
}
