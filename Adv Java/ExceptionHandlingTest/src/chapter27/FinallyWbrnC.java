package chapter27;
public class FinallyWbrnC {

	public static void main(String[] args) {
		//System.out.println(m1(5));
		
		System.out.println("main start");
		System.out.println("result : "+m1());
		System.out.println("m1 end");
	}
	/*@SuppressWarnings("finally")
	static int m1(int i) {
		while(i==5) {
			try {
				return 10;
			}
			finally {
				break;
			}
		}
		return 20; 
	}*/
	
	//case====01   important
	
	/*@SuppressWarnings("finally")
	static int m1(int i) {
		while(i==5) {
			try {
				return 10;
			}
			finally {
				continue;
			}
		}
		return 20; 
	}*/
	
	//case====02
	
/*	@SuppressWarnings("finally")
	static int m1() {
		int i=0;
		while(++i<=5) {
			try {
				System.out.println("in try "+i);
				return 10;
			}
			finally {
				System.out.println("in finally "+i);
				System.out.println("break is executed");
				break;
			}
		}
		System.out.println("after while loop");
		System.out.println("m1 end");
		return 20; 
	}*/
	
	//case====03
	
	/*@SuppressWarnings("finally")
	static int m1() {
		int i=0;
		while(++i<=5) {
			try {
				System.out.println("in try "+i);
				return 10;
			}
			finally {
				System.out.println("in finally "+i);
				System.out.println("break is executed");
				continue;
			}
		}
		System.out.println("after while loop");
		System.out.println("m1 end");
		return 20; 
	}*/
	
	//case====04
	
	@SuppressWarnings("finally")
	static int m1() {
		int i=0;
		while(++i<=5) {
			try {
				System.out.println("in try "+i);
				return 10/0;
			}
			finally {
				System.out.println("in finally "+i);
				System.out.println("break is executed");
				break;
			}
		}
		System.out.println("after while loop");
		System.out.println("m1 end");
		return 20; 
	}
}
