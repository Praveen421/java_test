package core;
/*class A22{
	int x=m1();
	int m1() {
		System.out.println("A m1");
		return 50;
	}
}
class B22 extends A22{
	int y=m1();
	int m1() {
		System.out.println("B m1");
		return 60;
	}
}

public class TestABCO {
	public static void main(String[] args) {
		B22 b=new B22();
		System.out.println("x:"+b.x);
		System.out.println("y:"+b.y);
	}
}
*/
/*
class A22{
	int x=m1();
	static int m1() {
		System.out.println("A m1");
		return 50;
	}
}
class B22 extends A22{
	int y=m1();
	static int m1() {
		System.out.println("B m1");
		return 60;
	}
}

public class TestABCO {
	public static void main(String[] args) {
		B22 b=new B22();
		System.out.println("x:"+b.x);
		System.out.println("y:"+b.y);
	}
}
*/
/*
class A22{
	int x=m1();
	int m1() {
		System.out.println("A m1");
		x=50; return 60;
	}
}
class B22 extends A22{
	int x;
	int m1() {
		System.out.println("B m1");
		x=70; return 80;
	}
}

public class TestABCO {
	public static void main(String[] args) {
		B22 b=new B22();
		A22 a=b;
		System.out.println("x:"+b.x);
		System.out.println("x:"+a.x);
	}
}
*/
class A22{
	static int x=m1();
	static int m1() {
		System.out.println("A m1");
		x=50; return 60;
	}
}
class B22 extends A22{
	static int x;
	static int m1() {
		System.out.println("B m1");
		x=70; return 80;
	}
}

public class TestABCO {
	public static void main(String[] args) {
		B22 b=new B22();
		A22 a=b;
		System.out.println("x:"+b.x);
		System.out.println("x:"+a.x);
	}
}