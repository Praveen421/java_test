package stringhandling;

import java.util.*;

public class EmptyTest {

	public static void main(String[] args) {
		String s1="";
		String s2="";
		String s3="a";
		String s4=new String("");
		String s5=new String(" ");
		String s6=new String("a");
		System.out.println("is S1 empty :"+s1.isEmpty());
		System.out.println("is S2 empty :"+s2.isEmpty());
		System.out.println("is S3 empty :"+s3.isEmpty());
		System.out.println("is S4 empty :"+s4.isEmpty());
		System.out.println("is S5 empty :"+s5.isEmpty());
		System.out.println("is S6 empty :"+s6.isEmpty());
		String s8=null;
		//System.out.println("is S8 empty :"+s8.isEmpty()); //NullPointerException
		//String s9;
		//System.out.println("is S9 empty :"+s9.isEmpty()); //CE:s9 not initialised
		Scanner s=new Scanner(System.in);
		System.out.print("enter the screen : ");
		String s10=s.nextLine();
		System.out.println("s10 isempty :"+s10.isEmpty());
		
	}
}