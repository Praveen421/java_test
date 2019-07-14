package stringhandling;

public class ContainsTest {

	public static void main(String[] args) {
		String s1="Hello praveen kumar";
		//System.out.println(s1.contains("Hello "));
		System.out.println(s1.startsWith("Hello "));
		System.out.println(s1.endsWith("kumar"));
		System.out.println(s1.substring(6,6));
		String s2="java Programming Language";
		int start=s2.indexOf("Programming");
		int end=start+11;
		System.out.println(s2.substring(start,end));
		System.out.println(s2.substring(s2.indexOf("Programming"),end));
		

	}

}
