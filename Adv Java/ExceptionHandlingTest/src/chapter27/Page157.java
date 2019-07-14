package chapter27;
public class Page157 {

	public static void main(String[] args) {
		System.out.println(m1(5));

	}

	@SuppressWarnings("finally")
	private static int m1(int i) {
		while(i==5) {
			try {
				return 10;
			}
			finally {
				break;
			}
		}
		return 20;
	}
	
	//case====02
	
	/*public static int m1(int i) {
		while(i==5) {
			try {
				return 10;
			}
			finally {
				continue;
			}
		}
		return 20;*/
	}
}
