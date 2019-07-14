package StringTest;
import java.util.*;
public class Test5 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string : ");
		String s=scn.nextLine();
		String[] sa=s.split(" ");
		System.out.println(Arrays.toString(sa));
		StringBuffer sb=new StringBuffer();
		for(int i=sa.length-1;i>=0;i--) {
			sb.append(sa[i]);
			sb.append(" ");
		}
		System.out.println(sb);
		
		
	}
}
