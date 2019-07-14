package StringTest;
class A{
	int x=10;
}
class B extends A{
	int y=20;
}
class C extends B{
	int x=30;
}
class D{}
public class UpcastingTest1 {
	public static void main(String[] args) {
		A a1=new A();
		A a2=new B();
		A a3=new C();
		//A a4=new D();      //error: can't convert D to A
		//B b1=new A();      //error: can't convert A to B
		B b2=new B();
		B b3=new C();
		//B b4=new D();      //error: can't convert D to B
		
		A a5=new B();
		B b5=(B)a5;
		System.out.println("hello 2");
		//C c5=(C)a5;		      //exception: CCT Ex
		//D d5=(D)a5;               //error: can't cast A to D
		
		A a6=new C();
		B b6=(B)a6;
		C c6=(C)a6;
		//D d6=(D)a6;                  //error: can't cast A to D
		
		Object obj7=new B();
		A a7=(A)obj7;
		B b7=(B)obj7;
		//C c7=(C)obj7;                //exception: CCT
		
		int a=10;
		float b=20;
		a=(int)b;
		
		B b8=(B)new C();
		System.out.println("hello mid");
		//B b9=(B)new A();                    //exception: CCT
		//B b10=(D)new D();                //error
		
		A a11=new C();
		System.out.println("hello mid 1");
		B b11=(B)(C)(A)(B)a11;
		B b12=(C)(B)(C)(B)a11; 
		
		A a22=new B();
		System.out.println(a22 instanceof Object); 	
		System.out.println(a22 instanceof A);
		System.out.println(a22 instanceof B);
		System.out.println(a22 instanceof C);
		//System.out.println(a22 instanceof D);     //CE: incompatible conditional operand types A and D
		
		System.out.println("hello");
		
	}
}
