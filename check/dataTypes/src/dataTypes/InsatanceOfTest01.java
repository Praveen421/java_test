package dataTypes;
public class InsatanceOfTest01 {
	public static void main(String[] args) {
		A a=new B();
		
		System.out.println(a instanceof Object);
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof C);
		System.out.println((Object)a instanceof D);
		
		Object obj=new C();
		
		System.out.println(obj instanceof A);
	}
}