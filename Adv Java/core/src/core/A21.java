package core;
class Example21 extends A21{
	
}
class Test21 extends A21{
	
}

public class A21 {
	void m1(Example21 e) {
		System.out.println("Example arg");
	}
	void m1(Test21 s) {
		System.out.println("Test arg");
	}
	public static void main(String[] args) {
		A21 a = new A21();
		a.m1(new Example21());
		//a.m1("abc");
		a.m1((Test21)null);
	}

}
