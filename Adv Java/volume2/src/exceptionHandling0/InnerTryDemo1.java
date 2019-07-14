package exceptionHandling0;

public class InnerTryDemo1 {
	public static void main(String[] args) {
		//System.out.println(10/0);
		try {
			System.out.println("in outer try");
			//System.out.println(10/0);
			try {
				System.out.println("in inner try");
				//System.out.println(10/0);
			}
			catch(ArithmeticException e) {
				System.out.println("in inner catch");
				//System.out.println(10/0);
			}
		}
		catch(NumberFormatException e) {
			System.out.println("in outer catch");
		}
		System.out.println("afrer outer try catch"); 
	}

}
