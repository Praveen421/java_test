package Nitra;
import java.util.*;
public class SubWithNR {
	public static void main(String[] args) {
		String s="ABCDBACDE";
		Set<Character> col=new HashSet<Character>();
		int i=0,j=0;
		int max=0;
		while(i<s.length()&j<s.length()) {
			if(!col.contains(s.charAt(j))) {
				col.add(s.charAt(j));
				j++;
				max=Math.max(max, j-i);
			}
			else {
				col.remove(s.charAt(i));
				i++;
			}
		}
		System.out.println(max);
	}
}
