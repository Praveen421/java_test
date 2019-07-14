package chapter27;
public class InnerTryDemo {

	public static void main(String[] args) {
		//====case 01
		
		try {
			System.out.println("in outer try");
			try {
				System.out.println("in inner try");
			}catch(ArithmeticException ae) {
				System.out.println("in inner catch");
			}
			System.out.println("after inner try/catch");
		}catch(ArithmeticException as) {
			System.out.println("in outer catch");
		}
		System.out.println("after outer try/catch");
		
		//====case 02
		
		/*System.out.println(10/0);
		try {
			System.out.println("in outer try");
			try {
				System.out.println("in inner try");
			}catch(ArithmeticException ae) {
				System.out.println("in inner catch");
			}
			System.out.println("after inner try/catch");
		}catch(ArithmeticException as) {
			System.out.println("in outer catch");
		}
		System.out.println("after outer try/catch");*/
		
		//====case 03
		
		/*try {
			System.out.println("in outer try");
			System.out.println(10/0);
			try {
				System.out.println("in inner try");
			}catch(ArithmeticException ae) {
				System.out.println("in inner catch");
			}
			System.out.println("after inner try/catch");
		}catch(ArithmeticException as) {
			System.out.println("in outer catch");
		}
		System.out.println("after outer try/catch");*/
		
		//====case 04
		
		/*try {
			System.out.println("in outer try");
			try {
				System.out.println("in inner try");
				System.out.println(10/0);
			}catch(ArithmeticException ae) {
				System.out.println("in inner catch");
			}
			System.out.println("after inner try/catch");
		}catch(ArithmeticException as) {
			System.out.println("in outer catch");
		}
		System.out.println("after outer try/catch");*/
		
		//====case 05
		
		/*try {
			System.out.println("in outer try");
			try {
				System.out.println("in inner try");
				System.out.println(10/0);
			}catch(NumberFormatException ae) { 
				System.out.println("in inner catch");
			}
			System.out.println("after inner try/catch");
		}catch(ArithmeticException as) {
			System.out.println("in outer catch");
		}
		System.out.println("after outer try/catch");*/
		
		//====case 06
		
		/*try {
			System.out.println("in outer try");
			try {
				System.out.println("in inner try");
				System.out.println(10/0);
			}catch(NumberFormatException ae) {
				System.out.println("in inner catch");
			}
			System.out.println("after inner try/catch");
		}catch(NumberFormatException as) {
			System.out.println("in outer catch");
		}
		System.out.println("after outer try/catch");*/
		
		//====case 07
		
		/*try {
			System.out.println("in outer try");
			try {
				
				System.out.println("in inner try");
				System.out.println(10/0);
				
			}catch(ArithmeticException ae) {
				
				System.out.println("in inner catch");
				System.out.println(10/0);
			}
			
			System.out.println("after inner try/catch");
			
		}catch(ArithmeticException as) {
			
			System.out.println("in outer catch");
		
		}
		
		System.out.println("after outer try/catch");*/
		
		//====case 08
		
		/*try {
			System.out.println("in outer try");
			try {
				
				System.out.println("in inner try");
				System.out.println(10/0);
				
			}catch(ArithmeticException ae) {
				
				System.out.println("in inner catch");
				System.out.println(10/0);
			}
			
			System.out.println("after inner try/catch"); 
			
		}catch(NumberFormatException as) {
			
			System.out.println("in outer catch");
		
		}
		
		System.out.println("after outer try/catch");*/
	}
}
 