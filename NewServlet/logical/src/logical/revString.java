package logical;
import java.util.*;
public class revString {
	static String m(String s) {
		if(s.length()==1) {
			return s;
		}else {
			return m(s.substring(1, s.length()))+s.charAt(0); 
		}
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the String : ");
		String s=scn.nextLine();
		System.out.println(m(s));		
	}
}