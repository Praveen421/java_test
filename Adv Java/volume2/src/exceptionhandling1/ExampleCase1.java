package exceptionhandling1;
public class ExampleCase1 {
	public static void main(String[] args) {
		m1();
	}
	static void m1() {
		try {
			System.out.println("in outer try");
			try {
				System.out.println("in inner try");
			}
		    catch(NullPointerException e) {
			    System.out.println("in inner catch");
		    }
		    finally {
			    System.out.println("in inner finally");
		    }
		    System.out.println("after inner try catch finally");
		}
		catch(NullPointerException e) {
			System.out.println("in outer catch");
		}
		finally {
			System.out.println("in outer finally");
		}
		System.out.println("after outer try catch finally");
	}
}
