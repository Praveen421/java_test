package exceptionHandling0;

public class DivisionTest {
	public static void main(String[] args) {
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println(c);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("please pass two integers");
		}
		catch(NumberFormatException n) {
			System.out.println("pass only integers");
		}
		catch(ArithmeticException e) {
			System.out.println("don't pass second value zero");
		}
	}
}