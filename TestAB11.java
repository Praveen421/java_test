class A{
	static void m1(){
		System.out.println("A m1");
	}
}
class B extends A{
	 static void m1(){
		System.out.println("B m1");
	}
}
class TestAB11{
	public static void main(String[] args){
		A a1=new A();
		a1.m1();
		if(a1 instanceof B){
		B b1=(B)a1;
		b1.m1();                      //here controll is not entering in if stmnt
		}
	}
}