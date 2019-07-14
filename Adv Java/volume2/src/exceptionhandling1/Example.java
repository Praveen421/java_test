package exceptionhandling1;
public class Example {
	public static void main(String[] args) {
		System.out.println(m1());
	}
	static int m1() {
		try {
			System.out.println("in outer try");
			try {
				System.out.println(10/0);
				return 20;
			}
			catch(NullPointerException e) {
				System.out.println("in inner catch");
				return 30;
			}
			finally {
				System.out.println("in inner finally");
				return 10;
			}
			//System.out.println("after");
		}
		catch(NullPointerException e) {
			System.out.println("in outer catch");
			return 40;
		}
		finally {
			System.out.println("in outer finally");
			return 50;
		}
		System.out.println("");
	}
} 