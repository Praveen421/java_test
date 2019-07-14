package Nitra;
import java.util.*;
public class SubsWNrepetition {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scn.nextLine();
		String[] ch=s.split("");
		System.out.println(Arrays.toString(ch));
		Set<String> col=new HashSet<String>();
		for(int i=0;i<ch.length;i++) {
			col.add(ch[i]);
		}
		System.out.println(col);
		int[] x= {10,20,30,40,50,60,70,80,90};
		for(int x1:x) {
			System.out.println(x1);
		}
	}
}
