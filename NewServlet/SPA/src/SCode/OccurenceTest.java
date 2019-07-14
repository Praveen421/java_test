package SCode;
import java.util.*;
public class OccurenceTest {
	public static void frequency(String s1,String s2) {
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		HashMap<Character,Integer> hm1=new HashMap<Character,Integer>();
		for(char ch0 : s1.toCharArray()) {
			if(hm.containsKey(ch0)) {
				hm.put(ch0, (Integer)hm.get(ch0)+1);
			}
			else {
				hm.put(ch0, 1);
			}
		}
		
		for(char ch1:s2.toCharArray()) {
			if(hm1.containsKey(ch1)) {
				hm1.put(ch1, (Integer)hm1.get(ch1)+1);
			}else {
				hm1.put(ch1, 1);
			}
		}		
		System.out.println("first collection : "+hm);
		System.out.println("second collection : "+hm1);
		
		System.out.println(hm.equals(hm1));
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the first string : ");
		String a=scn.nextLine();
		System.out.println("enter the second string : ");
		String b=scn.nextLine();
		String s1=a.replaceAll(" ", "");
		String s2=b.replaceAll(" ", "");
		System.out.println(a);
		System.out.println(b);
		frequency(s1,s2);	
	}
	
}