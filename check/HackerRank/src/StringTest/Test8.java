 package StringTest;
import java.util.*;
public class Test8 {
	public static void main(String[] args) {	
		ArrayList<Object> al=new ArrayList<>();
		for(byte i=97;i<109;i++) {
			byte[] b= {i};
			String s=new String(b);
			al.add(s);
		}
		System.out.println(al);
	}
}

