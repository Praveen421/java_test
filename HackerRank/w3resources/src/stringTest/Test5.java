package stringTest;
import java.util.*;
public class Test5 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the String : ");
		String s=scn.nextLine();
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i)+" "+s.indexOf(s.charAt(i)));
		}
		
	}

}
