package core;
class Example1{
	void add(int a,int b) {
		System.out.println("Example int,int");
	}
	void add(String a,float b) {
		System.out.println("Example String,float");
	}
	int add(String s1,String s2) {
		System.out.println("Example String,String");
		return 10;
	}
}
class Sample1 extends Example1{
	void add(int x,int y) {
		System.out.println("Sample int,int");
	}
	float add(float a,int b) {
		System.out.println("Sample float,int");
		return a+b;
	}
	String add(String s1,double d) {
		System.out.println("Sample String,double");
		return s1+d;
	}
}
public class TestES {
	public static void main(String[] args) {
		Sample1 s = new Sample1();
		s.add(10,20);
		s.add("abc",20);
		s.add("abc","xyz");
		s.add("10",20.0);
		//s.add(10,20.0f);
	}
}
