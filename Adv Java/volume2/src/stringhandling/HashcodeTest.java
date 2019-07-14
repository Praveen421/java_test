package stringhandling;
class Example1{
	int x;
	Example1(int x){
		this.x=x;
	}
	public int hashCode() {
		return x;
	}
}
public class HashcodeTest {
	public static void main(String[] args) {
		/*String s1=new String("a");
		String s2=new String("a");
		String s3=new String("abc");
		System.out.println("s1 : "+s1.length());
		System.out.println("s1 : "+s2.length());
		System.out.println("s1 : "+s3.length());
		System.out.println();
		System.out.println(System.identityHashCode(s1));
		System.out.println("s1 : "+s1.hashCode());
		System.out.println("s3 : "+s3.hashCode());
		String s4="b"; String s5="b"+"a";
		System.out.println("s4:"+s4.hashCode());
		System.out.println("s5:"+s5.hashCode());*/
		
		String s4="b"; String s5="b";
		System.out.println("s4: "+s4.hashCode());
		System.out.println("s5: "+s5.hashCode());
		System.out.println();
		System.out.println("s4: "+System.identityHashCode(s4));
		System.out.println("s5: "+System.identityHashCode(s5));
		System.out.println();
		
		Example1 e1=new Example1(5);
		Example1 e2=new Example1(5);
		Example1 e3=new Example1(6);
		System.out.println("e1 : "+e1.hashCode());
		System.out.println("e1 : "+System.identityHashCode(e1));
		System.out.println("e2 : "+System.identityHashCode(e2));
		
		e1.x=101;e2.x=102;e3.x=103;
		System.out.println("e1 : "+e1.hashCode());
		System.out.println("e2 : "+e2.hashCode());
		System.out.println("e3 : "+e3.hashCode());
		System.out.println("e1 : "+System.identityHashCode(e1));
		System.out.println("e2 : "+System.identityHashCode(e2));
		System.out.println("tostring"+e1.toString());
		
	}
}