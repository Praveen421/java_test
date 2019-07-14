package stringhandling;
import java.util.*;
public class Data {

	public static void main(String[] args) {
		/*Scanner s=new Scanner(System.in);
		System.out.println("enter Name");
		String a=s.nextLine();
		if(a.equals("HK")) {
			System.out.println("welcome to Naresh IT");
		}
		else {
			System.out.println("who the hell r u...");
		}*/
		/*StringBuffer sb = new StringBuffer("praveenKumar");
		System.out.println(sb);
		sb.insert(7, " ");
		System.out.println(sb);*/
		//String s1=new String();
		//System.out.println(s1);
		/*String s2=new String("abc");
		String s3=new String(s2);
		System.out.println(s2);
		System.out.println(s3);
		String s4=s3;
		System.out.println(s4==s3);
		System.out.println(s3==s2);
		char ch[]= {'a','b','c'	};
		String s5=new String(ch);
		System.out.println(s5);
		char[] ch1= {'p','r','a','v','e','e','n'};
		//String s6=new String(ch1,1,7);
		//System.out.println(s6);
		byte[] b= {97,99,101};
		String s7=new String(b,1,1);
		System.out.println(s7);*/
		
		char[] ch= {'s','i','d','d','h','a','r','t','h','a'};
		String s1=new String("praveen");
		String s2=new String(ch,2,8);
		System.out.println(ch);
		System.out.println(s2);
		System.out.println("s2 length : "+s2.length());
		System.out.println("s2 capacity : "+s2.strip());
		String s3=new String("null");
		System.out.println(s3);
		String s4=null;
		System.out.println("s4 : "+s4);
		//System.out.println("s4 length : "+s4.length()); //NullPointerException
		String s5="";
		System.out.println("s5 : "+s5);
		System.out.println("s5 length :"+s5.length());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}