package arrayTest;

public class Test {
	static Example[] e1=new Example[5];
	Example[] e2= {new Example(),new Example(),new Example(),new Example()};
	public static void main(String[] args) {
		System.out.println("test main");
		Example[] e3= new Example[3];
		System.out.println("e3 object is created");
		
		e1[0]=new Example();
		e3[0]=new Example();
		
		System.out.println("e1[0] : "+e1[0]);
		System.out.println("e3[0] : "+e3[0].x);
		//System.out.println("e2[0] : "+e2[0].x);
		
		Test t=new Test();
		System.out.println(t.e2[0].x);
		
		int l[]= {10,20,30,40};
		System.out.println(l.toString());
		System.out.println(l[0]);
		
	}

}
