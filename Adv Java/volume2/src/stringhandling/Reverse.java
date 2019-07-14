package stringhandling;
import java.util.*;
class StringReverse{
	public static String reverse(String s1) {
		/*String result=new String();
		for(int i=s1.length();i>0;i--) {
			result=result+s1.charAt(i);
		}
		return result;*/
		StringBuilder sb=new StringBuilder();
		for(int i=sb.length()-1;i>0;i++) {
			sb.append(s1.charAt(i));
		}
		return sb.toString(); 
	}
}
public class Reverse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string : ");
		String s1=s.nextLine();
		String s2=StringReverse.reverse(s1);
		System.out.println(s1);
		System.out.println(s2);
	}
}