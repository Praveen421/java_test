package oopTest;
class A1{
	void m1() {
		System.out.println("A m1");
	}
	void m2() {
		System.out.println("A m2");
		m1();
	}
}
public class B1 extends A1{
	void m1() {
		System.out.println("B m1");
	}
	public static void main(String[] args) {
		B1 b1=new B1();
		b1.m1(); 
		b1.m2();
		
		A1 a1=new B1();
		a1.m1();
		a1.m2();
	}
}
