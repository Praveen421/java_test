package exceptionHandling0;

public class FinallyWithContinue {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println("in loop : "+i);
			try {
				System.out.println("in try");
				if(i==5) {
					//System.out.println("55555555");
					return;
				}
			}
			finally {
				System.out.println("in finally");
			}
			System.out.println("after try-finally");
		}
		System.out.println("ater loop");
	}
}