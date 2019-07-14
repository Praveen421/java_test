package dataTypes;
/*public class Test {
	static void m3(Example e) {
		e.m1();	
		if(e instanceof Sample) {
		Sample s=(Sample)e;
		s.m2();
		}
	}
	public static void main(String[] args) {
		m3(new Sample());
		m3(new Example());
	}
}*/
public class Test {
	static void m3(Object obj) {
		if(obj instanceof Example) {
			Example e=(Example)obj;
			e.m1();
		}
		else if(obj instanceof Sample) {
			Sample s=(Sample)obj;
			s.m1();
			s.m2();
		}
	}
	public static void main(String[] args) {
		m3(new Sample());
		m3(new Example()); 
		m3(new Object());
	}
}
class Example{
	void m1() {
		System.out.println("m1");
	}
}
class Sample extends Example{
	void m2() {
		System.out.println("m2");
	}
}