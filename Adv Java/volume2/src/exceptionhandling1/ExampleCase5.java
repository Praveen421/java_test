package exceptionhandling1;

public class ExampleCase5 {
	public static void main(String[] args) {
		System.out.println(m1());
	}
	static int m1() {
		try {
			System.out.println("in outer try");
			try {
				System.out.println("\tin inner try");
				System.out.println(10/0);
			}
		    catch(NullPointerException e) {
			    System.out.println("\tin inner catch");
		    }
		    finally {
			    System.out.println("\tin inner finally");
		    }
		    System.out.println("after inner try catch finally");
		}
		catch(ArithmeticException e) {
			System.out.println("in outer catch");
		}
		finally {
			System.out.println("in outer finally");
			
		}
		System.out.println("after outer try catch finally");
		return 30;
	}
}