package smacfTest;
public class Test03 {
	static int a;
	static int b;
	static void m1() {
		a=10;
		b=20;
	}
	static void m2(int x,int y) {
		a=x;
		b=y;
	}
	static void m3(int a,int b) {
		a=a;
		b=b;
	}
	static void m4(int a,int b) {
		Test03.a=a;
		Test03.b=b;
	}
	public static void main(String[] args) {
		System.out.println(a+"........"+b);
		System.out.println();
		m1();
		System.out.println(a+"........"+b);
		System.out.println();
		m2(30,40);
		System.out.println(a+"........"+b);
		System.out.println();
		m3(50,60);
		System.out.println(a+"........"+b);
		System.out.println();
		m4(70,80);
		System.out.println(a+"........"+b);

	}

}
