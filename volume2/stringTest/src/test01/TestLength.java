package test01;
import java.util.*;
public class TestLength {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string : ");
		String s1=scn.next();
		String s2=scn.next();
		System.out.println(s1+"\t"+s2);
		System.out.println(s1.length()+"\t"+s2.length());
	}
}
