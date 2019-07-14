package stringTest;
import java.util.*;
public class DuplicateTest3 {
	public static void frequency(String s) {
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(char ch : s.toCharArray()) {
			if(hm.containsKey(ch)) {
				hm.put(ch, (Integer)hm.get(ch)+1);
			}
			else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string : ");
		String s=scn.nextLine();
		String s1=s.replaceAll(" ", "");
		System.out.println(s);
		System.out.println(s1);
		frequency(s1);		
   }
}