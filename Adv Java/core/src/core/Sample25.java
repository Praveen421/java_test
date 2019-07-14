package core;
abstract class Example25{
	//abstract void m1();
	static int a=10;
	int x=20;
	static {
		System.out.println("Example SB");
	}
	{
		System.out.println("Example NSB");
	}
	Example25(){
		System.out.println("Example constructor");
	}
	static void m2() {
		System.out.println("Example SM");
	}
	void m3() {
		System.out.println("Example NSM");
	}
	public static void main(String[] args) {
		System.out.println("Example main");
		System.out.println("a: "+a);
		m2();
		//Example25 e = new Example25();
		//e.m3();
	}    
}
public class Sample25 extends Example25 {
	/*public  void m1() {
		System.out.println("m1 in Sample");
	}*/
	static int b=30;
	int y=40;
	static {
		System.out.println("Sample SB");
	}
	{
		System.out.println("Sample NSB");
	}
	Sample25(){
		System.out.println("Sample constructor");
	}
	static void m4() {
		System.out.println("Sample SM");
	}
	void m5() {
		System.out.println("Sample NSM");
	}
	public static void main(String[] args) {
		System.out.println("Sample main");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		m2();
		m4();
		System.out.println();
		Sample25 s = new Sample25();
		//s.m1();
		s.m3();
		s.m5();
	}
}