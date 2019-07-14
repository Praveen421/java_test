package StringTest;
import java.util.*;
public class Test6 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string : ");
		String s1=scn .nextLine();
		System.out.println("enter the second string : ");
		/*StringBuffer sb=new StringBuffer(scn.nextLine());
		sb.insert(5, " inserted");
		System.out.println(sb);*/
		String s2=scn.nextLine();
		System.out.println(s1 +"       "+s2);
		System.out.println(s1.equals(s2));
		
		}
}
