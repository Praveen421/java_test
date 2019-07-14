package core;
class A20 {
	static int a=10;
	static {
		System.out.println("in ASB");
		System.out.println("a: "+a);
		//System.out.println("b :"+b);
		//System.out.println("b :"B2.getB());
		
	}
}
public class B20 extends A20 {
	static int b=20;
	static {
		System.out.println("in BSB");
		System.out.println("a : "+a);
		System.out.println("b :"+b);
		System.out.println("b : "+getB());
	}
	static int getB() {
		return b;
	}
	public static void main(String[] args) {
		System.out.println("in B main");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		}

}
