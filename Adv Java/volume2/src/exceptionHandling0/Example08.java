package exceptionHandling0;
public class Example08 {

	public static void main(String[] args) {
		int a=m1();
		System.out.println("a = "+a);
		System.out.println("after m1 : ....");
	}
/*	static int m1() {
		try {
			System.out.println("in try");
			return 10;
		}
		catch(ArithmeticException e) {
			System.out.println("in catch");
			return 20;
		}
		finally {
			System.out.println("in finally");
			return 30;
		}
	}
*/
	static int m1() {
		try {
			System.out.println("in try");
			System.out.println(10/0);
		}
		catch(NullPointerException e) {
			System.out.println("in catch");
		}
		finally {
			System.out.println("in finally");
			//int[] ia=new int[5];
		}
		
	}
	
}



















