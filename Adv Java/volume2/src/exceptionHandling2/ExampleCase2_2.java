package exceptionHandling2;

public class ExampleCase2_2 {
	public static void main(String[] args) {
		m1();
	}
	static void m1() {
	    int a;
		try {
			a=10;
			System.out.println("a : "+a);
		}
		catch(ArithmeticException e) {
			a=20;
			System.out.println("a : "+a);
		}
		System.out.println("a : "+a);
	}
}