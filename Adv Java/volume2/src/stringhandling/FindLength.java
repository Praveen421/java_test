package stringhandling;

import java.util.Scanner;

public class FindLength {

	public static void main(String[] args) {
		String s1="";
		String s2="";
		String s3="ab";
		String s4=new String("");
		String s5=new String(" ");
		String s6=new String("ab");
		System.out.println("s1 length : "+s1.length());
		System.out.println("s2 length : "+s2.length());
		System.out.println("s3 length : "+s3.length());
		System.out.println("s4 length : "+s4.length());
		System.out.println("s5 length : "+s5.length());
		System.out.println("s6 length : "+s6.length());
		String s8=null;
		//System.out.println("s8 length : "+s8.length()); //NullPointerException
		String s9="null";
		System.out.println("s9 length : "+s9.length());
		String s10;
		//System.out.println("s10 length : "+s10.length()); C.E: local variable not initialiged
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string : ");
		System.out.println("you entered "+s.nextLine().length()+" characters");
		System.out.println("s11 length : "+s11.length());
	}
	static String s11="abc";
}