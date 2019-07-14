package SCode;
import java.util.*;
public class duplicateTest {
	public static void main(String[] args) {
		Set<String> hs=new HashSet<>();
		Set ts=new TreeSet();
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the String : ");
		String s=scn.nextLine();
		String[] sa=s.split("");
		System.out.println(Arrays.toString(sa));
		for(int i=0;i<s.length();i++) {
			hs.add(sa[i]);
		}
		System.out.println(hs);
		ts.addAll(hs);
		System.out.println(ts);
		System.out.println(ts);
		
	}

}
