package exceptionHandling0;
class Example{
	void m1()
	throws ArithmeticException{
		System.out.println(1);
		try {
			System.out.println("2");
			System.out.println(3/0);
			System.out.println("4");
		}
		catch(Exception e) {
			System.out.println("5");
			System.out.println("6");
			System.out.println("7");
		}
		finally {
			System.out.println("in finally");
		}
	}
}
public class Example0 {

	public static void main(String[] args) {
		Example e1=new Example();
		try {
			e1.m1();
		}
		catch(ArithmeticException e) {
			System.out.println("don't devide by zero ");
		}
	}
}