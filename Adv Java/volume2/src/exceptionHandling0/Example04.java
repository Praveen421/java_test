package exceptionHandling0;
class Example03{
	void m1() {
		System.out.println("1");
		try {
			System.out.println("2");
			System.out.println(10/0);
			System.out.println("3");
		}
		catch(ArithmeticException e) {
			System.out.println("4");
			try {
			System.out.println(10/0);
			}
			catch(ArithmeticException a) {
				System.out.println("5");
			}
			//System.out.println("5");
		}
		System.out.println("6");
	}
}
public class Example04 {

	public static void main(String[] args) {
		Example03 e1=new Example03();
		e1.m1();

	}

}