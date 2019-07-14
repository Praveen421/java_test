package SCode;
import java.util.*;
public class ReverseRecursion {
	static String rev(String s1) {
		System.out.println("enter String is : "+s1);
		if(s1.length()<=1) {
			return s1;
		}else {
			String a=rev(s1.substring(1, s1.length()))+s1.charAt(0);
			System.out.println(a);
			return a;
		}
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string :");
		String s=scn.nextLine();
		System.out.println("\n"+rev(s));
	}
}
