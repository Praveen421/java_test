package core;

public class MOL2OverloadingMystery {
	public static void main(String[] bsdvf) {
	        Calleelmpl c1 =new Calleelmpl();
		    Object ob1 = new Object();
		    Object ob2 = "Hari krishna";
		    Object ob3 = new Integer(7279);
		    
		    c1.foo(ob1);
		    c1.foo(ob2);
		    c1.foo(ob3);
		    System.out.println();
		    c1.foo("HK");
		    c1.foo(7279);
		    System.out.println();
		    c1.foo((String)ob2);
		    c1.foo((Integer)ob3);
		    System.out.println();
		    //c1.foo((String)ob1);
		    //c1.foo((Integer)ob1);
		    //c1.foo((String)ob3);
		    //c1.foo((Integer)ob2);
		    
		    
    }
}