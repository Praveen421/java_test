package test;
public class SuperTest {
	int a=10;
	{
		System.out.println(a);
	}
	public SuperTest(){
		a=10;
	}
	
	
}

class SuperTest1 extends SuperTest{
	SuperTest1(){
		System.out.println(a);
		System.out.println("SuperTest1.SuperTest1()");
		//super(10);
		System.out.println(a);
	}
	public static void main(String[] args) {
		SuperTest1 e=new SuperTest1();
	}
	int b=20;
}