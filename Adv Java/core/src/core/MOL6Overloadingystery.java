package core;
class Calleelmp{
	public void foo(Object o) {
		System.out.println("Object parameter");
	}
	public void foo(String s) {
		System.out.println("String parameter");
	}
	public void foo(Integer i) {
		System.out.println("Integer parameter");
	}
}
public class MOL6Overloadingystery {
	public static void main(String[] args) {
		Calleelmp cl = new Calleelmp();
		Object ob1=new Object();
		Object ob2="harikrishna";
		Object ob3=new Integer(7279);
		
		cl.foo(ob1);
		cl.foo(ob2);
		cl.foo(ob3);
		System.out.println();
		cl.foo("hk");
		cl.foo(7279);
		System.out.println();
		cl.foo((String)ob2);
		cl.foo((Integer)ob3);
		System.out.println();
		//cl.foo((String)ob1);
		cl.foo((Integer)ob1);
		//cl.foo((String)ob3);
		//cl.foo((Integer)ob2);
	}

}
