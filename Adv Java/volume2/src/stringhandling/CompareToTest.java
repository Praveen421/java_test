package stringhandling;
public class CompareToTest {
	public static void main(String[] args) {
		String s1="praveen kumar";
		String s2="a";
		String s3="A";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		
		String s4="ABCDE";
		String s5="ABC";
		System.out.println(s4.compareTo(s5));
		System.out.println(s5.compareToIgnoreCase(s4)); //subtract s5 to s4 
		
		System.out.println(s1.contentEquals(s3));
		
		StringBuffer sb1=new StringBuffer("praveen kumar");
		StringBuffer sb2=new StringBuffer("PRAVEEN KUMAR");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(s1.contentEquals(sb2));
		System.out.println(sb2);
		System.out.println(sb2.compareTo(sb1));
		System.out.println(sb1==sb2);
		
		String s6="Praveen Kumar";
		System.out.println(s6.charAt(1));
		System.out.println(s6.charAt(8));
		System.out.println(s6.charAt(7)+""+s6.charAt(8)+" "+s6.charAt(9));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}