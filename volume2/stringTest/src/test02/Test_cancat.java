package test02;
import java.util.*;
public class Test_cancat {
	public static void main(String[] args) {	
		String s3="a";
		s3.concat("b");
		System.out.println(s3);
		String s4=s3.concat("b");
		System.out.println(s4);
		System.out.println(s3==s4);
		
		String s1="hari";
		char[] ch1=s1.toCharArray();
		System.out.println(ch1);
		byte[] b1=s1.getBytes();
		System.out.println(b1);
		System.out.println(String.valueOf(10));
		System.out.println(String.valueOf(10.67));
		System.out.println(String.valueOf('a'));
		System.out.println(new B1());
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
}
class B1{
	public String toString() {
		return "hi";
	}
}