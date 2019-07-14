package chapter27;
public class Page153 {

	public static void main(String[] args) {
		m1();
		System.out.println("after m1()");
	}

	/*@SuppressWarnings("finally")
	static int m1() {
		try {
			System.out.println("in try");
			System.out.println(10/0);
			return 10;
		}catch(NullPointerException ae) {
			System.out.println("in catch");
			return 20;
		}
		finally {
			System.out.println("in finally");
			return 30;
		}
	}*/
	
	//case====02
	
	static int m1() {
		try {
			System.out.println("in try");
			System.out.println(10/0);
			return 10;
		}catch(NullPointerException ae) {
			System.out.println("in catch");
			//return 20;
		}
		finally {
			System.out.println("in finally");
			
		}
		return 30; 
	
	//case====03
	
	/*static void m1() {
		try {
			System.out.println("in try");
			System.out.println(10/0);
			
		}catch(NullPointerException ae) {
			System.out.println("in catch");
			
		}
		finally {
			System.out.println("in finally");
			int[] ia=new int[-5];
		}*/
	
	//case====04
	
	/*static int m1() {
		try {
			System.out.println("in try");
			System.out.println(10/0);
			return 10;
		}catch(NullPointerException ae) {
			System.out.println("in catch");
			return 20;
		}
		finally {
			System.out.println("in finally");
			return 30;
		}	*/
	}
}
