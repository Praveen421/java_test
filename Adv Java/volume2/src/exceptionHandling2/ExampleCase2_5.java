package exceptionHandling2;

public class ExampleCase2_5 {

	public static void main(String[] args) {
		m1();
	}
	static void m1() {
		int a;
		try {
			a=10;
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			a=20;
		}
		finally {
			a=30;
		}
		System.out.println(a);
	}
}
