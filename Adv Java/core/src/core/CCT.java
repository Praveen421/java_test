package core;
class A19{
	static int a =10;
	int x = 20;
}
class B19 extends A19{
	static int b = 30;
	int y = 40;
}
class C19 extends B19{
	static int c = 50;
	int z = 60;
}
public class CCT {
	static void m1(byte b) {
		System.out.println("byte arg");
	}
	public static void main(String[] args) {
		A19 a1=new A19();
		System.out.println("a1.a :"+a1.a);
		if(a1 instanceof B19) {
		B19 b1=(B19)a1;
		System.out.println("b1.b :"+b1.b);
		}
	}
}