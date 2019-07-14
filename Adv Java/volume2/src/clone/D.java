package clone;
class A{
	int p=5;
}
class B extends A{
	int q=6;
}
class C extends B{
	int r=7;
}
public class D extends C
implements Cloneable{
	int s=8;
	public String toString() {
		return "p : "+p+"\n"+"q : "+q+"\n"+"r : "+r+"\n"+"s : "+s;
	}
	public String TOSTRING() {
		return super.toString();
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		D d1=new D();
		D d2=(D)d1.clone();
		System.out.println("d1 object data \n"+d1);
		System.out.println("d2 object data \n"+d2);
		System.out.println("d1 object data \n"+d1.TOSTRING());
		System.out.println("d2 object data \n"+d2.TOSTRING());
		
		d2.p=12; d2.q=13; d2.r=14; d2.s=15;
		System.out.println("d1 object data \n"+d1);
		System.out.println("d2 object data \n"+d2);
		System.out.println("d1 object data \n"+d1.TOSTRING());
		System.out.println("d2 object data \n"+d2.TOSTRING());
	}
}