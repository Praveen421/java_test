package stringTest;
import java.util.*;
public class Test4 {
	public static void main(String[] args) {
		
		String s="hello";
		String[] s1=s.split("");
		byte[] b=s.getBytes();
		
		System.out.println(Arrays.toString(b));
	}    

}
