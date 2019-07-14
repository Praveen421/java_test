package stringTest;
import java.util.*;
public class Test1 {
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		String s;
		for(byte i=67;i<108;i++) {
			byte[] b= {i};
			s=new String(b);
			al.add(s);
		}
		System.out.println(al);
		
		String s1="aaaabbbbbbbss";
		String sa[]=s1.split("");
		System.out.println(Arrays.toString(sa));
		System.out.println(sa[0].equals(sa[5]));
	}
}
