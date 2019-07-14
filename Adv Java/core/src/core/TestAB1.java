package core;
class A{
	int x = m1();
	int m1() {
		System.out.println("A m1");
		return 50;
	}
}
class B extends A{
	int y = m1();
	int m1() {
		System.out.println("B m1");
		return 60;
	}
}
public class TestAB1 {
	public static void main(String[] args) {
		B b = new B();
		System.out.println("x : "+b.x);
		System.out.println("y : "+b.y);
	}
}
/*
class A{
	int x = m1();
	static int m1() {
		System.out.println("A m1");
		return 50;
	}
}
class B extends A{
	int y=m1();
	static int m1() {
		System.out.println("B m1");
		return 60;
	}
}
public class TestAB1 {
	public static void main(String[] args) {
		B b = new B();
		System.out.println("x : "+b.x);
		System.out.println("y : "+b.y);
	}
}
*/
/*
class A{
	int x = m1();
	int m1() {
		System.out.println("A m1");
		x=50;
		return 60;
	}
}
class B extends A{
	int x;
	int m1() {
		System.out.println("B m1");
		x=70;
		return 80;
	}
}
public class TestAB1 {
	public static void main(String[] args) {
		B b = new B();
		A a = b;
		System.out.println("x : "+b.x);
		System.out.println("x : "+a.x);
	}
}
*/

/*
class A{
	static int x = m1();
	static int m1() {
		System.out.println("A m1");
		x=50;
		return 60;
	}
}
class B extends A{
	static int x;
	static int m1() {
		System.out.println("B m1");
		x=70;
		return 80;
	}
}
public class TestAB1 {
	public static void main(String[] args) {
		B b = new B();
		A a = b;
		System.out.println("x : "+b.x);
		System.out.println("x : "+a.x);
	}
}
