package smacfTest;
public class Test01 {
	static int a=m1();
	static int m1(){
		System.out.println("variable a is created : ");
		return 10;
	}
	
	static int m2() {
		System.out.println("variable b is created :");
		return 20;
	}
	static int b=m2();
	public static void main(String[] args) {
		System.out.println("in main");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}
