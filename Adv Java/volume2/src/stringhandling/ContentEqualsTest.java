package stringhandling;
public class ContentEqualsTest {
	public static void main(String[] args) {
		String s1="a";
		String s2=new String("a");
		StringBuffer s3=new StringBuffer("a");
		
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.contentEquals(s3));
		System.out.println(s1==s2);
		
		String s4="praveen";
		System.out.println(s4.charAt(0));
		
	}
}