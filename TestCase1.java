package castingg;

class Excelsheet {
	void DataFetching() {
		System.out.println("1");
	}
}

public class TestCase1 extends Excelsheet {
	void LogintoLogout() {
		System.out.println("2");
	}

	public static void main(String[] args) {
		Excelsheet e1 = new TestCase1(); // Upcasting
		e1.DataFetching(); // with ref var we can access only parent class property
		TestCase1 t1 = (TestCase1) e1; // Downcasting explicit way only
		t1.DataFetching();
		t1.LogintoLogout();

	}

}
