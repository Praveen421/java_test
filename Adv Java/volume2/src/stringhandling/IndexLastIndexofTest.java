package stringhandling;
public class IndexLastIndexofTest {
	public static void main(String[] args) {
		String s1="java programming Language";
		System.out.println(s1.length());
		
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.indexOf('p',3));
		System.out.println(s1.lastIndexOf("Language"));
		System.out.println(s1.lastIndexOf("ava"));
		System.out.println(s1.indexOf('a',5));
		System.out.println(s1.lastIndexOf('a',5));
		
		String s2="java by HARI krishna";
		String s3=new String("hello PRAVEEN kumar");
		
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		
		String s4="javaHariKrishna";
		System.out.println(s4.contains("a"));
		System.out.println(s4.contains("A"));
		System.out.println(s4.contains("aH"));
		System.out.println(s4.contains("Hari"));
		//System.out.println(s4.contains(s4.equalsIgnoreCase("javaharikrishna")));
		
		
	}
}