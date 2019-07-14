package fundamental;
class Example1{
	int x=10,y=20;
}
class Test1{
	
}
public class Comparison {

	public static void main(String[] args) {
		int x=10,y=20,z=30;
		System.out.println(x==y);
		System.out.println(y==z);
		Example1 e1=new Example1();
		Example1 e2=new Example1();
		Test2 t1=new Test2();
		System.out.println(e1==e2);
		boolean bo=true;
		//System.out.println(x==bo);
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(t1));
		System.out.println(null==null);
		System.out.println(e1==null);
		System.out.println(null==null);
		System.out.println(new Example1()==null);
		Example1 e3=new Example1();
		System.out.println(e3.equals(null));
		System.out.println(e3.equals(null));
	}
}