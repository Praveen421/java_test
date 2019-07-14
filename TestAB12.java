class A{
	static void m1(){
		System.out.println("A m1");
	}
	void m2(){
		System.out.println("A m2");
	}
}
class B extends A{
	static void m1(){
		System.out.println("B m1");
	}
	void m2(){
		System.out.println("B m2");
	}
}
class TestAB12{
	public static void main(String[] args){
		B b1=new B();
		b1.m1();
		b1.m2();
		A a1=new A();
		a1.m1();
		a1.m2();
		A a2=new B();
		a2.m1();
		a2.m2();
	}
}