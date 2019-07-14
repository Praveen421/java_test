package SCode;
import java.util.*;
public class IntegerOcurrenceTest {
	public static void main(String[] args) {
		HashMap<Character,Integer> hm=new HashMap<>();
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the String :");
		String s=scn.nextLine();
		for(char ch:s.toCharArray()) {
			if(hm.containsKey(ch)) {
				hm.put(ch,(Integer)hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
	}
}
