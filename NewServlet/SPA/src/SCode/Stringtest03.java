package SCode;
import java.util.*;
public class Stringtest03 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the String : ");
		String s=scn.nextLine();
		String[] sa=s.split(" ");
		StringBuffer sb=new StringBuffer();
		for(int i=sa.length-1;i>=0;i--) {
			sb.append(sa[i]+" ");
		}
		System.out.println(sb);
	}
}
