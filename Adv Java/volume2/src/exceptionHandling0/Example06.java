package exceptionHandling0;
public class Example06 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println("in loop : "+i);
			try {
				System.out.println("in try");
				if(i==5) {
					continue;
				}
			}
			finally {
				System.out.println("in finally");
			}
			System.out.println("after try/finally");
		}
		System.out.println("after loop");
	}
}