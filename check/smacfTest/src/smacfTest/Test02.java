package smacfTest;
public class Test02 {
	static int a;
	static void m1(int a) {
		a=a;
		System.out.println("a :"+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a : "+a);
		m1(50);
		System.out.println("a :"+a);
	}

}
