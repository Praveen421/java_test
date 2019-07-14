package exceptionHandling2;

public class ExampleCase1 {

	public static void main(String[] args) {
		int a=10;
		try {
			int b=20;
			System.out.println("a : "+a);
			System.out.println("b : "+b);
		}
		catch(ArithmeticException e) {
			a=30;
			//b=40;
		}
		System.out.println(a);
		//System.out.println(b);
	}

}
