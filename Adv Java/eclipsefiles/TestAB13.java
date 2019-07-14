//executing overridden method from super class
class Example{
	void m1(){
		System.out.println("Example m1");
	}
	void m2(){
		System.out.println("Example m2");
	}
	void m3(){
		System.out.println("Example m3");
	}
}
class TestAB13 extends Example{
	void m1(){
		System.out.println("Sample  m1");
	}
	void m2(){
		super.m2();
		System.out.println("Sample m2");
	}
	public static void main(String...args){
		TestAB13 t=new TestAB13();
		t.m1();  t.m2();  t.m3();
	}
}