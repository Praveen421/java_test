package SCode;
import java.util.*;
public class SortingAtsize {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Map<Integer,String> tm=new TreeMap<>();
		System.out.println("enter the String : ");
		String s=scn.nextLine();
		String[] sa=s.split(" ");
		for(int i=0;i<sa.length;i++) {
			tm.put(sa[i].length(),(String)sa[i]);
		}
		System.out.println(tm.values());
			
	}
}