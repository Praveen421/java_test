package test02;
import java.util.*;
public class Test_split {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s1="Hari NIT";
		System.out.println(s1);
//		String[] sa1=s1.split(" ");
//		System.out.println(sa1);
//		System.out.println(sa1.length);
//		System.out.println(Arrays.toString(sa1));
		
		String[] sa5=s1.split("A");
		System.out.println(sa5.length);
		System.out.println(Arrays.deepToString(sa5));
		
//		String[] sa6=s1.split("T");
//		System.out.println(sa6.length);
//		System.out.println(Arrays.deepToString(sa6));
//		
//		s1="abc abc abc";
//		String[] sa7=s1.split("a");
//		System.out.println(Arrays.deepToString(sa7));
		String[] sa8=s1.split("H");
		System.out.println(sa8.length);
		System.out.println(Arrays.toString(sa8));
		
		String[] sa9=s1.split("T");
		System.out.println(sa9.length);
		System.out.println(Arrays.toString(sa9));
		
		s1="abc abc abc";
		String[] sa10=s1.split("a");
		System.out.println(sa10.length);
		System.out.println(Arrays.toString(sa10));
		
		
		String[] sa11=s1.split("c");
		System.out.println(sa11.length);
		System.out.println(Arrays.toString(sa11));
		
		String[] sa12=s1.split("abc abc abc");
		System.out.println(sa12.length);
		System.out.println(Arrays.toString(sa12)); 
		System.out.println(Arrays.deepToString(sa12));
		
		
		s1="abc.text";
		System.out.println(s1);
		
		String[] sa13=s1.split(".");
		System.out.println(sa13.length);
		System.out.println(Arrays.toString(sa13));
		System.out.println(Arrays.deepToString(sa13));
		
		String[] sa14=s1.split("\\.");
		System.out.println(sa14.length);
		System.out.println(Arrays.toString(sa14));
		System.out.println(Arrays.deepToString(sa14));
		
		String[] sa15=s1.split("");
		System.out.println(sa15.length);
		System.out.println(Arrays.toString(sa15));
	}
}
