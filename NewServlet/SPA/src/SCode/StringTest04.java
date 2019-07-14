package SCode;
import java.util.*;
public class StringTest04 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the String : ");
		String s=scn.nextLine();
		int count=0;
		StringBuffer sb=new StringBuffer(s);
		for(int i=0;i<s.length();i++) {		
			char v=sb.charAt(i);
			switch(v) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				sb.setCharAt(i, Character.toUpperCase(v));
				count++;
				break;
			}
		}
		s=sb.toString();
		System.out.println(s);
		System.out.println("no. of vowels are : "+count);
	}
}
