package core;
/*class A3{
	void m1(int a) {
		System.out.println("A int arg");
	}
}
class B3 extends A3{
	void m1(float f) {
		System.out.println("B float arg");
	}
}
public class MOL5 {
	public static void main(String[] args) {
		//B3 b = new B3();
		//b.m1(50);
		//b.m1('a');
		//b.m1(50L);
		System.out.println();
		A3 a = new B3();
		a.m1(50);
		a.m1('a');
		//a.m1(50L);
	}
}
*/
class A3{
	void m1(float a) {
		System.out.println("A float arg");
	}
}
class B3 extends A3{
	void m1(int a) {
		System.out.println("B int arg");
	}
}
public class MOL5 {
	public static void main(String[] args) {
		B3 b = new B3();
		b.m1(50);
		b.m1('a');
		b.m1(50L);
		System.out.println();
		A3 a = new B3();
		a.m1(50);
		a.m1('a');
		a.m1(50L);
	}
}
