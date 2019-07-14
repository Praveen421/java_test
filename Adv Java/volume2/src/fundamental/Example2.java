package fundamental;
/*public class Example2 {
	int x=10,y=20;
	public static void main(String[] args) throws CloneNotSupportedException {
		Example2 e1 = new Example2();
		Example2 e2 = (Example2)e1.clone();
	}
}*/
//error in below code
/*public class Example2 implements Cloneable() {
	int x=10;
	int y=20;
	public static void main(String[] args) throws CloneNotSupportedException {
		Example2 e1 = new Example2();
		Example2 e2 = (Example2)e1.clone();
	}
}*/

public class Example2 implements Cloneable {
	int x=10,y=20;
	public static void main(String[] args) throws CloneNotSupportedException {
		Example2 e1 = new Example2();
		e1.x=5;
		e1.y=6;
		
		Example2 e2 = (Example2)e1.clone();
		System.out.println(e1==e2);
		System.out.println(e1.hashCode()==e2.hashCode());
		System.out.println("e1 : "+e1+"e2 : "+e2);
		e2.x=8;
		e2.y=9;
		System.out.println();
		System.out.println(e1.x+"...."+e1.y);
		System.out.println(e2.x+"...."+e2.y);
		Example2 e3=(Example2)e2.clone();
		System.out.println(e3+"..."+e2);
	}
}