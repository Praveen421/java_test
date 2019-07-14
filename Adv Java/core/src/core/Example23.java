package core;
public class Example23 {
	int x=m1();
	{
		System.out.println("NSB");
	}
	int m1() {
		System.out.println("m1:x");
		return 10;
	}
	Example23(){
		this(10);
		x=50;
		System.out.println("No-arg constructor");
	}
	Example23(int a){
		this("abc");
		x=60;
		System.out.println("int arg constructor");
	}
	Example23(String str){
		x=70;
		System.out.println("String-arg constructor");
	}
	public static void main(String[] args) {
		Example23 e1=new Example23();
		System.out.println("e1.x:"+e1.x);
		Example23 e2=new Example23();
		System.out.println("e2.x:"+e2.x);
		Example23 e3=new Example23();
		System.out.println("e3.x:"+e3.x);
	}

}
