package exceptionhandling1;

public class ExampleCase4_1 {
	public static void main(String[] args) {
		System.out.println(m1());
	}
	static int m1() {
		try {
			System.out.println("in outer try ");
			try {
				System.out.println("in inner try");
				System.out.println(10/0);
			}
		    catch(NullPointerException e) {
			    System.out.println("in inner catch");
		    }
		    finally {
			    System.out.println("in inner finally");
			    return 20;
		    }
		   // System.out.println("after inner try catch finally");
		}
		catch(NullPointerException e) {
			System.out.println("in outer catch");
		}
		finally {
			System.out.println("in outer finally");
			return 30;
		}
		
	}
}
