package fundamental;
class A{
	static void m1(Object obj) {
		String  name=obj.getClass().getName();
		System.out.println("class name is : "+name);
	}
}
class B{
	
}
class C extends B{
	
}
public class Test3 {

	public static void main(String[] args) {
		String s1="abc";
		Integer io=50;
		Object obj=new A();
		B b1=new B();
		B b2=new C();
		
        A.m1(s1);
		A.m1(io);
		A.m1(obj);
		A.m1(b1);
		A.m1(b2);
		B b3=new C();
		C c=(C)b3;
		A.m1(c);
		Test3 t=new Test3();
		String s=t.getClass().getName();
		
	}
}