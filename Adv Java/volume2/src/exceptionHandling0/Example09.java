package exceptionHandling0;

public class Example09 {

	public static void main(String[] args) {
		System.out.println(m1(5));

	}
	static int m1(int a) {
		while(a==5) {
			try {
				return 10;
			}
			finally {
				continue;
			}
		}
		return 20;
	}
}