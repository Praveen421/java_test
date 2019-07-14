package exceptionhandling1;

public class Example6 {

	public static void main(String[] args) {
		System.out.println(m1(5));

	}
	static int m1(int i) {
		while(i==5) {
			System.out.println("in while i : "+i);
			try {
				System.out.println("in outer try i : "+i);
				try {
					i=10;
					System.out.println("in inner try i : "+i);
				}
				finally {
					i=20;
					System.out.println("in inner finally i : "+i);
				}				
				i=30;
				System.out.println("after inner(try-finally) i : "+i);
				return 30;				
			}
			finally {
				if(i==30) {
					System.out.println("after outer finally i : "+i);
					break;
				}
			}
		}
		System.out.println("after all i : "+i);
		return 40;
	}
}