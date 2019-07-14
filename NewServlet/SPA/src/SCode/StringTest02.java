package SCode;
import java.util.*;
public class StringTest02 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the String : ");
		String s=scn.nextLine();
		String[] sa=s.split(" ");
		System.out.println(Arrays.toString(sa));
		TreeMap<String,Integer> ts=new TreeMap<>();
		ArrayList<String> al=new ArrayList<>();
		for(int i=0;i<sa.length;i++) {
			ts.put(sa[i],sa[i].length());
		}
		System.out.println(ts.values());
		for(String i:ts.keySet()) {
			al.add(i);
		}
		System.out.println(al);
	}
}
