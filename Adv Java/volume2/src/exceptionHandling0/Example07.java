package exceptionHandling0;
public class Example07 {
	public static void main(String[] args) {
		try {
			System.out.println("in try");
			System.exit(0);
		}
		finally {
			System.out.println("in finally");
		}
		System.out.println("after finally");
	}	
}