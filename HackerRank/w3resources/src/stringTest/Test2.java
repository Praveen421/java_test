package stringTest;
import java.util.*;
public class Test2 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		while(true) {
		System.out.println("first string : ");		
		String s1=scn.nextLine();
		System.out.println("second : ");
		String s2=scn.nextLine();
		System.out.println("both string end with with same letters : "+s1.endsWith(s2)+
				" \t data is same : "+s1.equalsIgnoreCase(s2));
		}
	}
}