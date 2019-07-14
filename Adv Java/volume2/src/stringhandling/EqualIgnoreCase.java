package stringhandling;
class Example{
	int x;
	Example(int x){
		this.x=x;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Example) {
			Example e=(Example)obj;
			return (this.x==e.x);
		}
		return false;
	}
}
class Sample{
	
}

public class EqualIgnoreCase {

	public static void main(String[] args) {
		String s1="a";
		String s2="a";
		String s3=new String("a");
		String s4=new String("a");
		
		StringBuffer sb1=new StringBuffer("a");
		StringBuffer sb2=new StringBuffer("a");
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(sb1==sb2);
		System.out.println();
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(sb1.equals(sb2));
		System.out.println();
		
		String s5="a";
		String s6="A";
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		
		Example e1=new Example(5);
		Example e2=new Example(5);
		Example e3=new Example(6);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1==e2);
		System.out.println(e2.equals(e3));
		
		Sample s8=new Sample();
		System.out.println(e1.equals(s8));
		
		
		
		
		
		
		

	}

}